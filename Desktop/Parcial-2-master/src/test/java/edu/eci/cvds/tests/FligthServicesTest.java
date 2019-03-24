package edu.eci.cvds.tests;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Airline;
import edu.eci.cvds.services.FligthServices;
import edu.eci.cvds.services.FligthServicesFactory;
import edu.eci.cvds.services.ServicesException;

import org.quicktheories.core.Gen;

import static org.quicktheories.QuickTheory.qt;


import static org.quicktheories.generators.SourceDSL.*;

public class FligthServicesTest extends TestBase{

    @Inject
    FligthServices fligthServices;

    
    @Test
    public void pruebaCeroTest() throws SQLException, ServicesException {
        //Insertar datos en la base de datos de pruebas, de acuerdo con la clase
        //de equivalencia correspondiente

    	qt().forAll(Generators.airlines()).check((airline) -> {
			try {
				fligthServices.AddNewAirline(airline);

				for (Airline air : fligthServices.listAirlines()) {
					if (air.getNombre().equals(air.getNombre())) {
						return true;
					}
				}

				return false;
			} catch (ServicesException ex) {
				ex.printStackTrace();
				return false;
			}

		});
    }    
    

}
