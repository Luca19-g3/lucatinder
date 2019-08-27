package com.lucatinder.g3.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	@GetMapping("/")
	public String vesPalIndex() {
		return "index";
	}
}
