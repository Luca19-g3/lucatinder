package com.lucatinder.g3.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucatinder.g3.modelo.Perfil;
/**
 * Clase PerfilDAOImpl
 * 
 * Clase para trabajar con la tabla Perfil en la base de datos.
 * @version 1.0
 * @author Jorge
 * 
 * 27/08/2019
 * 
 */

@Repository
public class PerfilDAOImpl implements PerfilDAO {
	
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
     * 27/08/2019
     * 
     */
	
	@Override
	@Transactional
	public Perfil newPerfil(Perfil p) {
		entityManager.merge(p);
		return p;
	}
	

	
}
