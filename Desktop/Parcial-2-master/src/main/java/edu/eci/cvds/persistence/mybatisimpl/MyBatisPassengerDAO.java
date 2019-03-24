package edu.eci.cvds.persistence.mybatisimpl;

import edu.eci.cvds.persistence.PassengerDAO;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;
import edu.eci.cvds.persistence.FligthDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.FligthMapper;
import edu.eci.cvds.persistence.mybatisimpl.mappers.PassengerMapper;

public class MyBatisPassengerDAO implements PassengerDAO{
	
	@Inject 
	PassengerMapper passengerMapper;
	
	@Override 
	public List<Passenger> loadByFligth(String fligth) throws PersistenceException{
		return passengerMapper.findByFligth(fligth);
	}
	
	@Override
	public void save(Passenger p) throws PersistenceException{
		passengerMapper.save(p);
	}

	@Override
	public List<Passenger> loadAll() throws PersistenceException {
		return passengerMapper.getAll();
	}

	@Override
	public void addNewPassenger(Fligth vuelo, Passenger pasajero) {
		passengerMapper.addNewPassenger(vuelo,pasajero);
	}

	@Override
	public void save(Fligth vuelo, Passenger pasajero) throws PersistenceException {
		passengerMapper.save(vuelo,pasajero);
		
	}

	@Override
	public Passenger getPassenger() throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
