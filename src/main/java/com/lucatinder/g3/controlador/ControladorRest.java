package com.lucatinder.g3.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucatinder.g3.LucaTinderApplication;
import com.lucatinder.g3.modelo.Perfil;
import com.lucatinder.g3.servicios.Servicio;



/**
 * Clase ControladorRest
 * 
 * Controlador REST para dirigir el flujo web y los datos que recibe el Front
 * 
 * @version 1.0
 * @author Jorge
 * 
 *         27/08/2019
 * 
 */
@RestController
public class ControladorRest {
private static final Logger logger = LoggerFactory.getLogger(LucaTinderApplication.class);
	
	@Autowired
	private Servicio servicio;
	
	
	@PostMapping(value = "/newrest")
	public Perfil newPerfil(Perfil p) {
		servicio.newPerfil(p);
		return p;
	}
}
