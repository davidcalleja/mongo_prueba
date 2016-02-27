package info.davidcalleja.model.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -150428698911752871L;

	private String nombre;

	private String calle;

	public Usuario() {}

	public Usuario(String nombre, String calle) {
		setNombre(nombre);
		setCalle(calle);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}
}
