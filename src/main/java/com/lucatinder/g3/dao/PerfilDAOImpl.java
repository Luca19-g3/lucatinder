package com.lucatinder.g3.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import com.lucatinder.g3.LucaTinderApplication;
import com.lucatinder.g3.modelo.Perfil;

/**
 * Clase PerfilDAOImpl
 * 
 * Clase para trabajar con la tabla Perfil en la base de datos.
 * 
 * @version 1.0
 * @author Jorge
 * 
 *         27/08/2019
 * 
 */

@Repository
public class PerfilDAOImpl implements PerfilDAO {
	private static final Logger logger = LoggerFactory.getLogger(LucaTinderApplication.class);

	@PersistenceContext
	private EntityManager entityManager;

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
		logger.info("Ejecutando el metodo newPerfil en la clase PerfilDAOImpl");
		entityManager.merge(p);
		return p;
	}

}
