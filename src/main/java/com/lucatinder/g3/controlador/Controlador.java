package com.lucatinder.g3.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lucatinder.g3.LucaTinderApplication;
import com.lucatinder.g3.modelo.Perfil;
import com.lucatinder.g3.servicios.Servicio;

/**
 * Clase Controlador
 * 
 * Controlador MVC para dirigir el flujo web y los datos que recibe el Front
 * 
 * @version 1.0
 * @author Jorge
 * 
 *         27/08/2019
 * 
 */

@Controller
public class Controlador {

	private static final Logger logger = LoggerFactory.getLogger(LucaTinderApplication.class);
	@Autowired
	private Servicio servicio;
	/**
	 * Metodo palIndex
	 * 
	 * Metodo para crear un nuevo Perfil
	 * 
	 * @param Perfil p Perfil que se va crear
	 * @return index.html
	 * @version 1.0
	 * @author Jorge
	 * 
	 *         27/08/2019
	 * 
	 */
	@GetMapping("/")
	public String palIndex(@ModelAttribute("perfil") Perfil p) {
		return "index";
	}
	/**
	 * Metodo login
	 * 
	 * Metodo para entrar a la aplicacion
	 * 
	 * @param ModelMap model guarda el perfil que ha logeado
	 * @param int id Id que introduce el usuario
	 * @return paginaPerfil.html
	 * @version 1.0
	 * @author Jorge
	 * 
	 *         27/08/2019
	 * 
	 */
	
	@PostMapping("/entrar")
	public ModelAndView login(@RequestParam("id")int id) {
		logger.info("****************************Intentando entrar");
		ModelAndView model;
		if (servicio.getPerfil(id) == null) {
			model = new ModelAndView("redirect:/");
		} else {
			model = new ModelAndView("paginaPerfil");
			model.addObject("perfil", servicio.getPerfil(id) );
		}
		return model;
	}

	/**
	 * Metodo newPerfil
	 * 
	 * Metodo para crear un nuevo Perfil
	 * 
	 * @param Perfil p Perfil que se va crear
	 * @return model
	 * @version 1.0
	 * @author Jorge
	 * 
	 *         27/08/2019
	 * 
	 */
	@PostMapping("/new")
	public ModelAndView newPerfil(@ModelAttribute("perfil") Perfil p) {
		logger.info("**************************************GUARDANDO Perfil");
		servicio.newPerfil(p);
		logger.info("******************************Perfil GUARDADO" +p.toString());
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
}
