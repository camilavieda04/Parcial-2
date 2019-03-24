package edu.eci.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.eci.cvds.persistence.AirlineDAO;
import edu.eci.cvds.persistence.FligthDAO;
import edu.eci.cvds.persistence.PassengerDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisAirlineDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisFligthDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisPassengerDAO;
import edu.eci.cvds.services.FligthServices;
import edu.eci.cvds.services.impl.FligthServicesImpl;


public class GuiceContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() {

				install(JdbcHelper.MySQL);

				setEnvironmentId("development");

				setClassPathResource("mybatis-config.xml");

				bind(FligthServices.class).to(FligthServicesImpl.class);
				bind(AirlineDAO.class).to(MyBatisAirlineDAO.class);
                bind(FligthDAO.class).to(MyBatisFligthDAO.class);
                bind(PassengerDAO.class).to(MyBatisPassengerDAO.class);
			}
		}

		);

		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}

}