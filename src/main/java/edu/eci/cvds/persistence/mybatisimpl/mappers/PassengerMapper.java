package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;



public interface PassengerMapper {
	
	List<Passenger> getAll();
	
	List<Passenger> findByFligth(@Param("fligth") String codigo);
	
	Passenger consultarPassenger(String no_id);

	void save(Passenger p);

	void addNewPassenger(Fligth vuelo);

	void addNewPassenger(Fligth vuelo, Passenger pasajero);

	void save(Fligth vuelo, Passenger pasajero);
	
	

}
