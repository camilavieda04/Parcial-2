package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Airline;
import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;
import edu.eci.cvds.persistence.*;
import edu.eci.cvds.services.FligthServices;
import edu.eci.cvds.services.ServicesException;

public class FligthServicesImpl implements FligthServices {
	
	@Inject
	private AirlineDAO airlineDAO;
	
	@Inject
	private FligthDAO fligthDAO;
	
	@Inject
	private PassengerDAO passengerDAO;
	

	@Override
	public List<Airline> listAirlines() throws ServicesException {
		try {
			return airlineDAO.loadAll();
		} catch (PersistenceException ex) {
			throw new ServicesException("Create user error:"+ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public List<Fligth> listFLigthByAirline(int airline) throws ServicesException {
		try {
			return fligthDAO.loadByAirline(airline);
		} catch (PersistenceException ex) {
			throw new ServicesException("Create user error:"+ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public void addNewPassenger(Fligth vuelo, Passenger pasajero) throws ServicesException {
		try {
			 passengerDAO.save(vuelo,pasajero);
		}
		catch(PersistenceException ex) {
			throw new ServicesException("Create user error: " + ex.getLocalizedMessage(),ex);
		}

	}

	@Override
	public List<Fligth> listAllFligths() throws ServicesException {
		try {
			return fligthDAO.loadAll();
		
		}
		catch(PersistenceException ex) {
			throw new ServicesException("Create user error: " + ex.getLocalizedMessage(),ex);
		}
	}

	@Override
	public List<Passenger> listPassengerByFligth(String fligtg) throws ServicesException {
		try {
			return passengerDAO.loadByFligth(fligtg);
		}
		catch(PersistenceException ex) {
			throw new ServicesException("Create user error: "+ ex.getLocalizedMessage(),ex);
		}
	}

	@Override
	public List<Fligth> listFligthByPlace(String place) throws ServicesException {
		try {
			return fligthDAO.loadByPlace(place);
		}
		catch(PersistenceException ex) {
			throw new ServicesException("Create user error: "+ex.getLocalizedMessage(),ex);
		}
	}

	@Override
	public void AddNewAirline(Airline airline) throws ServicesException {
		try {
			airlineDAO.save(airline);
		} catch (PersistenceException ex) {
			throw new ServicesException("Create user error:"+ex.getLocalizedMessage(), ex);
		}
		
	}
	

}
