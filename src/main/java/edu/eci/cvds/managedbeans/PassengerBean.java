package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Passenger;
import edu.eci.cvds.services.FligthServices;
import edu.eci.cvds.services.ServicesException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "passengerBean")
@SessionScoped

public class PassengerBean extends BasePageBean{
	@ManagedProperty(value = "#{param.fligth}")
	private String fligth;
	
	private static final long serialVersionUID = 3594009161252782831L;

	String fligtg;
	
	@Inject
	private FligthServices fligthServices;
	
	public List<Passenger> getData() throws Exception{
		try {
			return fligthServices.listPassengerByFligth(fligtg);
		}
			
		catch(ServicesException ex) {
			throw ex;
		}
	}
	
	
	
	
}
