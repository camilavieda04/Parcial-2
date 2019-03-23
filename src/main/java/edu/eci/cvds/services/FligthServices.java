package edu.eci.cvds.services;

import java.util.List;

import edu.eci.cvds.entities.*;

public interface FligthServices {
	
	public void AddNewAirline(Airline airline) throws ServicesException;
	
	public List<Airline> listAirlines() throws ServicesException;
	
	public List<Fligth> listFLigthByAirline(int airline) throws ServicesException; 
	
	public void addNewPassenger(Fligth vuelo, Passenger pasajero) throws ServicesException;

	public List<Fligth> listAllFligths() throws ServicesException;
	
	public List<Passenger> listPassengerByFligth(String fligtg) throws ServicesException;
	
	public List<Fligth> listFligthByPlace(String place) throws ServicesException;

}
