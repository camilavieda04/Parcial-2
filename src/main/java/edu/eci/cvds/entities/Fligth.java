package edu.eci.cvds.entities;

import java.util.LinkedList;
import java.util.List;

public class Fligth {
	private String codigo;
	private String origen;
	private String destino;
	private int duracion;
	
	
	public Fligth(String codigo, String origen, String destino, int duracion) {
		super();
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}	

}
