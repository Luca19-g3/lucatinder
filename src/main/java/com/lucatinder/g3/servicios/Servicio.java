package com.lucatinder.g3.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucatinder.g3.modelo.ErrorPropio;
import com.lucatinder.g3.modelo.Perfil;
@Service
public interface Servicio {
	/**
	 * Interface ServicioImpl
	 * 
	 * Interface para dirigir la logica de la aplicacion
	 * @version 1.0
	 * @author Jorge
	 * 
	 * 27/08/2019
	 * 
	 */

	public Perfil newPerfil(Perfil p);
	public Perfil getPerfil(int id);
	public ErrorPropio setError(String msg);
	public List<Perfil> crearPerfilFalso(int cantidad);
}
