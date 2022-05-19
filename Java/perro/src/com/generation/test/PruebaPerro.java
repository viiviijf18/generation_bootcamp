package com.generation.test;

import com.generation.model.Perro;

public class PruebaPerro {

	public static void main(String[] args) {
		Perro perro1 = new Perro("Pelusa","French","Chico",21,3,"Blanco");
		Perro perro2 = new Perro("Solovino","Mestizo","Mediano",14,2,"Café");
		
		perro1.setHumano("Juan");
		perro2.setHumano("Daniel");
		
		System.out.println(perro1.toString());
		System.out.println(perro2);
		
		perro1.comer();
		System.out.println(Perro.buscarHumano(2));

	}//Fin del main

}//Fin de la clase prueba
