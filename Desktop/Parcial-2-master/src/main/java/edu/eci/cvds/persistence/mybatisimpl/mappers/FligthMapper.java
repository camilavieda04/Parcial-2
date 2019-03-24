package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;


public interface FligthMapper {
	
	List<Fligth> findByAirline(@Param("airline") int codAirline);
	
	void save(Fligth fligth);
	
	List<Fligth> getAll();
	
	void addPassenger(String fligthId, Passenger passenger);
	
	Fligth consultarFligth(int fligthCod);

	public List<Fligth> findByPlace(@Param("place")String place);
}
