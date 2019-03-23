package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Airline;
import edu.eci.cvds.entities.Fligth;

public interface AirlineMapper {
	
	List<Airline> getAll();
	
	void save(Airline airline);
	
	List<Airline> findByPais(@Param("pais") String pais);

	void addFligth(int airlineId, Fligth fligth);

	Airline consultarAirline(String nombre);
	
	Airline consultarAirline(int airlineID);

}
