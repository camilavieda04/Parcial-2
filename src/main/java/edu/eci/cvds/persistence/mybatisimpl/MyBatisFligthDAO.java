package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;
import edu.eci.cvds.persistence.FligthDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.FligthMapper;

public class MyBatisFligthDAO implements FligthDAO {
	
	@Inject
	FligthMapper fligthmapper;

	@Override
	public List<Fligth> loadAll() throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void save(Fligth a) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");

	}

	@Override
	public void update(Fligth a) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");

	}

	@Override
	public void addPassenger(int FligthId, Passenger passeenger) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");

	}

	@Override
	public Fligth load(int fligthCod) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<Fligth> loadByAirline(int airline) throws PersistenceException {
		return fligthmapper.findByAirline(airline); 
	}

}
