package com.lucatinder.g3.modelo;



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
public class ErrorPropio {

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
