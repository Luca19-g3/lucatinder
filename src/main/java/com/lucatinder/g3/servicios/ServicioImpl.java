package com.lucatinder.g3.servicios;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.g3.dao.PerfilDAO;
import com.lucatinder.g3.modelo.Perfil;

@Service
@Transactional
public class ServicioImpl implements Servicio {
    @Autowired
	private PerfilDAO perfilDao;
	
	@Override
	public Perfil newPerfil(Perfil p) {
		return perfilDao.newPerfil(p);
		
	}

	
}
