package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Airline;
import edu.eci.cvds.entities.Fligth;

public interface AirlineDAO {
	
	public List<Airline> loadAll() throws PersistenceException;
    
    public void save(Airline a) throws PersistenceException;
    
    public void update(Airline a) throws PersistenceException;
    
    public void addFligth(int airlineId, Fligth fligth) throws PersistenceException;
    
    public Airline load(int airlineID) throws PersistenceException;

    public Airline load(String nombre) throws PersistenceException;

    public List<Airline> loadByPais(String pais) throws PersistenceException;

}
