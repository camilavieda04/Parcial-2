package edu.eci.cvds.services;

import static com.google.inject.Guice.createInjector;

import java.util.Optional;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Injector;

import edu.eci.cvds.persistence.AirlineDAO;
import edu.eci.cvds.persistence.FligthDAO;
import edu.eci.cvds.persistence.PassengerDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisAirlineDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisFligthDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisPassengerDAO;
import edu.eci.cvds.services.impl.FligthServicesImpl;

public class FligthServicesFactory {
	
	private static FligthServicesFactory instance = new FligthServicesFactory();
	
	private static Optional<Injector> optInjector = Optional.empty();
	
	private Injector myBatisInjector(String env, String pathResource, JdbcHelper jdbcHelper) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                install(jdbcHelper);
                setClassPathResource(pathResource);
                
                bind(FligthServices.class).to(FligthServicesImpl.class);
                bind(AirlineDAO.class).to(MyBatisAirlineDAO.class);
                bind(FligthDAO.class).to(MyBatisFligthDAO.class);
                bind(PassengerDAO.class).to(MyBatisPassengerDAO.class);
            }
          
        });
    }
	
	private FligthServicesFactory() {
		
	}
	
	public FligthServices getFligthServices() {
		if(!optInjector.isPresent()) {
			optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml", JdbcHelper.MySQL));
		}
		
		return optInjector.get().getInstance(FligthServices.class);
	}
	
	public FligthServices getFligthServicesTesting() {
		if(!optInjector.isPresent()) {
			optInjector = Optional.of(myBatisInjector("test","mybatis-config-h2.xml", JdbcHelper.H2_FILE));
		}
		
		return optInjector.get().getInstance(FligthServices.class);
	}
	
	public static FligthServicesFactory getInstance() {
		return instance;
	}

}
