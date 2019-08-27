package com.lucatinder.g3.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucatinder.g3.modelo.Perfil;


@Repository
public class PerfilDAOImpl implements PerfilDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public Perfil newPerfil(Perfil p) {
		entityManager.merge(p);
		return p;
	}
	

	
}
