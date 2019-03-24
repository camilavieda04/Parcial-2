package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Airline;
import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.persistence.AirlineDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.AirlineMapper;

public class MyBatisAirlineDAO implements AirlineDAO {
	
	@Inject
	AirlineMapper airlineMapper;

	@Override
	public List<Airline> loadAll() throws PersistenceException {
		return airlineMapper.getAll();
	}

	@Override
	public void save(Airline a) throws PersistenceException {
		airlineMapper.save(a);

	}

	@Override
	public void update(Airline a) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");

	}

	@Override
	public void addFligth(int airlineId, Fligth fligth) throws PersistenceException {
		airlineMapper.addFligth(airlineId, fligth);

	}

	@Override
	public Airline load(int airlineID) throws PersistenceException {
		try {
			return airlineMapper.consultarAirline(airlineID);
		}
		catch(org.apache.ibatis.exceptions.PersistenceException e) {
			throw new PersistenceException("Error al consultar la aerolinea"+airlineID,e);
		}
	}

	@Override
	public Airline load(String nombre) throws PersistenceException {
		try {
			return airlineMapper.consultarAirline(nombre);
		}
		catch(org.apache.ibatis.exceptions.PersistenceException e) {
			throw new PersistenceException("Error al consultar la aerolinea"+nombre,e);
		}
	}

	@Override
	public List<Airline> loadByPais(String pais) throws PersistenceException {
		return airlineMapper.findByPais(pais);
	}
	
	public void AddNewAirline (Airline airline) throws PersistenceException{
		airlineMapper.AddNewAirline(airline);
	}
	

}
