package com.generation.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mandardatos")
public class MandarDatos {
	
	@GetMapping("/saludo")
	public String saludo() {
		return "Te vuelvo a saludar";
	}
	
	//Pedir datos
	@GetMapping("/mandarsaludos")
	public String mandarS( @RequestParam(value = "nombre" , defaultValue = "nadie") String nombre,
						   @RequestParam(value = "apellido" , defaultValue = "") String apellido
						   ) 
	{
		return "Le mando saludos a todos, en especial a " + nombre + " " + apellido
				;
	}

} //Fin de la clase
