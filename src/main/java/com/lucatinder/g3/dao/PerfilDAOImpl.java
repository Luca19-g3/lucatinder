package com.lucatinder.g3.dao;

import java.util.List;

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
		logger.info("Ejecutando el metodo getPerfil en la clase ServicioImpl");
		return entityManager.find(Perfil.class, id);
	}
	
	/**
	 * Metodo getListaPerfil
	 * 
	 * Metodo para obtener una lista de usuarios con id distinto del id dado y longitud definida
	 * 
	 * @param int id Id del perfil a evitar en la lista de usuarios
	 * @param int longitud Longitud de la lista devuelta
	 * @return List<Perfil> Lista con n objetos de tipo Perfil obtenidos
	 * @version 1.0
	 * @author Joaquin
	 * 
	 *         28/08/2019
	 * 
	 */

	@Override
	
	public List<Perfil> getListaPerfil(int id, int longitud) {
		logger.info("Ejecutando el metodo getListaPerfil en la clase ServicioImpl");
		//return entityManager.find(Perfil.class, id);
		String hql = "FROM Perfil WHERE id != " + id ;
		return (List<Perfil>) entityManager.createQuery(hql).setMaxResults(longitud).getResultList();
	}

}
