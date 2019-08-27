package com.lucatinder.g3.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lucatinder.g3.LucaTinderApplication;

/**
 * Clase Controlador
 * 
 * Controlador MVC para dirigir el flujo web y los datos que recibe el Front
 * @version 1.0
 * @author Jorge
 * 
 * 27/08/2019
 * 
 */

@Controller
public class Controlador {
	
	private static final Logger logger = LoggerFactory.getLogger(LucaTinderApplication.class);
	
	@GetMapping("/")
	public String vesPalIndex() {
		return "index";
	}
	
	
	
}
