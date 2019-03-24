package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;
import edu.eci.cvds.persistence.FligthDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.FligthMapper;

public class MyBatisFligthDAO implements FligthDAO {
	Passenger passenger;
	Fligth codigo;
	@Inject
	FligthMapper fligthmapper;

	@Override
	public List<Fligth> loadAll() throws PersistenceException {
		return fligthmapper.getAll();
	}

	@Override
	public void save(Fligth a) throws PersistenceException {
		fligthmapper.save(a);

	}

	@Override
	public void update(Fligth a) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void addPassenger(String FligthId, Passenger passeenger) throws PersistenceException {
		fligthmapper.addPassenger(FligthId, passenger);

	}

	@Override
	public Fligth load(int fligthCod) throws PersistenceException {
	try {
		return fligthmapper.consultarFligth(fligthCod);
	}
	catch(org.apache.ibatis.exceptions.PersistenceException e) {
		throw new PersistenceException("Error al consultar el vuelo"+fligthCod,e);
	}
		
	}

	@Override
	public List<Fligth> loadByAirline(int airline) throws PersistenceException {
		return fligthmapper.findByAirline(airline); 
	}

	@Override
	public List<Fligth> loadByPlace(String place) throws PersistenceException {
		return fligthmapper.findByPlace(place);
	}

}
