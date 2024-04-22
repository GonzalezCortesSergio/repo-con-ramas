package com.salesianostriana.dam.ejemploconramas02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class ControladorSaludo {

	@GetMapping("/")
	public String saludarALuismi(Model model) {
		
		model.addAttribute("saludo", "Hola a todos, específicamente a ti Luismi");
		
		return "index";
	}
}
