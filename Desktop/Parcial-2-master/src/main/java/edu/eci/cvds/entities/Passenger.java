package edu.eci.cvds.entities;

public class Passenger {
	private TiposID tipo_id;
	private String no_id;
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Passenger(TiposID tipo_id, String no_id, String nombre, String apellido, String telefono) {
		super();
		this.tipo_id = tipo_id;
		this.no_id = no_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	public Passenger() {
		
	}
	
	public Passenger(TiposID tipo_id2, int nextUserID, String nombre2, String apellido2, String telefono2) {
		
	}
	public TiposID getTipo_id() {
		return tipo_id;
	}

	public void setTipo_id(TiposID tipo_id) {
		this.tipo_id = tipo_id;
	}

	public String getNo_id() {
		return no_id;
	}

	public void setNo_id(String no_id) {
		this.no_id = no_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
