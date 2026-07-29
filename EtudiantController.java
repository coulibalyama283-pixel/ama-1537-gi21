package com.akc.tech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EtudiantController {
	
private final EtudiantService service;

	EtudiantController(EtudiantService service) {
		this.service = service;
	}
	
@GetMapping("/")

	public String accueil(Model model) {
	model.addAllAttributes(service.listeEtudiants());
	return "index";
}
}
