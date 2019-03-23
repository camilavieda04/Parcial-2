package edu.eci.cvds.tests;

import org.junit.Before;
import org.mybatis.guice.XMLMyBatisModule;

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

;

public class TestBase {
	protected Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId("test");
                setClassPathResource("mybatis-config-h2.xml");
                
                bind(FligthServices.class).to(FligthServicesImpl.class);
                bind(AirlineDAO.class).to(MyBatisAirlineDAO.class);
                bind(FligthDAO.class).to(MyBatisFligthDAO.class);
                bind(PassengerDAO.class).to(MyBatisPassengerDAO.class);
            }
    });
	
	@Before
	public void setup() {
		injector.injectMembers(this);
	}
}
