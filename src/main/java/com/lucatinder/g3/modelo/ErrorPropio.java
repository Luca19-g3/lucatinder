package com.lucatinder.g3.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;



/**
 * Clase Perfil
 * 
 * Clase para gestionar los errores
 *
 * @version 1.0
 * @author Jorge
 * 
 * 27/08/2019
 * 
 */
@Component("errorpropio")
@Entity
public class ErrorPropio {
	@Id
	private String mensaje;
	
	
	public ErrorPropio() {
		
	}

	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	@Override
	public String toString() {
		return "Error [mensaje=" + mensaje + "]";
	}
	
	
	
	
}
