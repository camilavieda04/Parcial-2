/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Fligth;
import edu.eci.cvds.services.FligthServices;
import edu.eci.cvds.services.ServicesException;

/**
 *
 * @author hcadavid
 * @author fchaves
 * @author salzate
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "fligthBean")
@RequestScoped
public class FligthBean extends BasePageBean {
	
	
	private String place;
	@ManagedProperty(value = "#{param.airline}")
	private int airline;
	@ManagedProperty(value = "#{param.airlineName}")
	private String airlineName;

	/**
	 * 
	 */
	private static final long serialVersionUID = 3594009161252782831L;

	@Inject
	private FligthServices fligthServices;

	public List<Fligth> getData() throws Exception {
		try {
			if (airline == 0) {
				return fligthServices.listAllFligths();
			} else {
				return fligthServices.listFLigthByAirline(airline);
			}
		} catch (ServicesException ex) {

			throw ex;
		}

	}
	
	public List<Fligth> consultarVueloPorLugar(String place) throws ServicesException{
		return fligthServices.listFligthByPlace(place);
	}

	public int getAirline() {
		return airline;
	}

	public void setAirline(int airline) {
		this.airline = airline;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}


	



}
