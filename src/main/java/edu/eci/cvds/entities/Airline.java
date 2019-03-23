package edu.eci.cvds.entities;

import java.util.LinkedList;
import java.util.List;

public class Airline {
	private int codigo;
	private String nombre;
	private String web_page;
	private String pais;
		
	public Airline(int codigo, String nombre, String web_page, String pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.web_page = web_page;
		this.pais = pais;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getWeb_page() {
		return web_page;
	}
	public void setWeb_page(String web_page) {
		this.web_page = web_page;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	

}
