package edu.eci.cvds.tests;

import org.quicktheories.core.Gen;

import edu.eci.cvds.entities.Airline;

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
	
	
}
