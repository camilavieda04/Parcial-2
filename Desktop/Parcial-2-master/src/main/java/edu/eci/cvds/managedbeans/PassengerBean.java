package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import javax.inject.Inject;

import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.entities.Passenger;
import edu.eci.cvds.services.FligthServices;
import edu.eci.cvds.services.ServicesException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "passengerBean")
@RequestScoped

public class PassengerBean extends BasePageBean{
	@ManagedProperty(value = "#{param.fligth}")
	private String fligth;
	@ManagedProperty(value="#{param.fligthname}")
	private String fligthName;
	
	private static final long serialVersionUID = 3594009161252782831L;

	//String fligtg;
	
	@Inject
	private FligthServices fligthServices;
	
	public List<Passenger> getData() throws Exception{
		try {
			return fligthServices.listPassengerByFligth(fligth);
		}
			
		catch(ServicesException ex) {
			throw ex;
		}
	}
	
	public String getFligth() {
		return fligth;
	}
	
	public void setFligth(String fligth) {
		this.fligth=fligth;
	}
	
	public String getFligthName() {
		return fligthName;
	}
	
	public void setFligthName(String fligthName) {
		this.fligthName=fligthName;
	}
	
	
	
}
