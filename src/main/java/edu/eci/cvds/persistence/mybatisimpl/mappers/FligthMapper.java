package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.cvds.entities.Fligth;

public interface FligthMapper {
	
	List<Fligth> findByAirline(@Param("airline") int codAirline);

}
