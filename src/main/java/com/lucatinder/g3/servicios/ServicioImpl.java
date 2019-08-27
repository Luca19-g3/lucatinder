package com.lucatinder.g3.servicios;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.g3.LucaTinderApplication;
import com.lucatinder.g3.dao.PerfilDAO;
import com.lucatinder.g3.modelo.Perfil;

/**
 * Clase ServicioImpl
 * 
 * Clase para dirigir la logica de la aplicacion
 * 
 * @version 1.0
 * @author Jorge
 * 
 *         27/08/2019
 * 
 */

@Service
@Transactional
public class ServicioImpl implements Servicio {
	private static final Logger logger = LoggerFactory.getLogger(LucaTinderApplication.class);

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
	 *         27/08/2019
	 * 
	 */

	@Override
	public Perfil newPerfil(Perfil p) {
		logger.info("Ejecutando el metodo newPerfil en la clase ServicioImpl");
		return perfilDao.newPerfil(p);

	}
	/**
	 * Metodo getPerfil
	 * 
	 * Metodo para encontrar un perfil por id
	 * 
	 * @param int id Id del perfil que se va a buscar
	 * @return Perfil p Perfil encontrado
	 * @version 1.0
	 * @author Jorge
	 * 
	 *         27/08/2019
	 * 
	 */
	@Override
	public Perfil getPerfil(int id) {
		return perfilDao.getPerfil(id);
	}

}
