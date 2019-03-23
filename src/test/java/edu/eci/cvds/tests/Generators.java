package edu.eci.cvds.tests;

import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;

import edu.eci.cvds.entities.Airline;
import edu.eci.cvds.entities.Passenger;

import static org.quicktheories.generators.SourceDSL.*;


public class Generators {
	
	static private int nextUserID = 0;
	
	static public Gen<Airline> airlines() {
		return integers().allPositive()
				.zip(strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						(codigo,name, webPage, pais) -> {
							nextUserID++;
							return new Airline(nextUserID, name, webPage, pais);
						});
	}
	
	static public Gen<Passenger> passengers(){
		return Generate.enumValues(TiposID)
				.zip(strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						(tipo_id,no_id,nombre,apellido,telefono) -> {
							nextUserID++;
							return newPassenger(tipo_id,nextUserID,nombre,apellido,telefono);
						});
	}
	
	
	
	
	
   
	
}
