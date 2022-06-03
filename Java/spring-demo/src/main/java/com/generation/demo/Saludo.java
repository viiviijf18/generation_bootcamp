package com.generation.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Saludo {
	
	/*****Peticiones WEB*****/
	// GET, POST, DELETE, PUT
	
	@GetMapping("/saludo")
	public String saludo() {
		return "Hola mundo";
	}
	
	//Petición para pedir información
	@GetMapping("/holaSpring")
	public String holaSpring() {
		return "Hola mundo desde Spring";
	}
	
	//Petición para guardar información
	@PostMapping("/login")
	public String login() {
		return "Te logueaste";
	}
	
}
