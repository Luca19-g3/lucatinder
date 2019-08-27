package com.lucatinder.g3.servicios;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.g3.dao.PerfilDAO;
import com.lucatinder.g3.modelo.Perfil;
/**
 * Clase ServicioImpl
 * 
 * Clase para dirigir la logica de la aplicacion
 * @version 1.0
 * @author Jorge
 * 
 * 27/08/2019
 * 
 */

@Service
@Transactional
public class ServicioImpl implements Servicio {
    @Autowired
	private PerfilDAO perfilDao;
	
    /**
     * Metodo newPerfil
     * 
     * Metodo para crear un nuevo Perfil
     * 
     * @param Perfil p Perfil que se va crear
     * @return Perfil p Perfil que se va a crear
     * @version 1.0
     * @author Jorge
     * 
     * 27/08/2019
     * 
     */

	@Override
	public Perfil newPerfil(Perfil p) {
		return perfilDao.newPerfil(p);
		
	}

	
}
