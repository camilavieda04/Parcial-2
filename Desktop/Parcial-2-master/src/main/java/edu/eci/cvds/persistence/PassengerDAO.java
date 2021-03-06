package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Passenger;
import edu.eci.cvds.entities.Airline;
import edu.eci.cvds.entities.Fligth;


public interface PassengerDAO {
	
	public List<Passenger> loadAll() throws PersistenceException;
	
	public void save (Passenger p) throws PersistenceException;

	List<Passenger> loadByFligth(String fligth) throws PersistenceException;

	public void addNewPassenger(Fligth vuelo, Passenger pasajero);

	public void save(Fligth vuelo, Passenger pasajero) throws PersistenceException;
	
	public Passenger getPassenger() throws PersistenceException;

	
	

}
