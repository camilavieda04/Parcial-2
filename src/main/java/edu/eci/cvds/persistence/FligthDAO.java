package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;

public interface FligthDAO {
public List<Fligth> loadAll() throws PersistenceException;
    
    public void save(Fligth a) throws PersistenceException;
    
    public void update(Fligth a) throws PersistenceException;
    
    public void addPassenger(String FligthId, Passenger passeenger) throws PersistenceException;
    
    public Fligth load(int fligthCod) throws PersistenceException;

    public List<Fligth> loadByAirline(int airline) throws PersistenceException;

    public List<Fligth> loadByPlace(String place) throws PersistenceException;
}
