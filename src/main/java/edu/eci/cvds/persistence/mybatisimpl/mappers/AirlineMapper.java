package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Airline;

public interface AirlineMapper {
	
	List<Airline> getAll();
	
	void save(Airline airline);

}
