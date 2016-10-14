package info.davidcalleja.model.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = -150428698911752871L;

	private String nombre;

	private String calle;

	public UsuarioDTO() {}

	public UsuarioDTO(String nombre, String calle) {
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
