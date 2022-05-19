package com.perritos;

public class PruebaPerros {

	public static void main(String[] args) {
		
		// Instanciar
		Perro perro1 = new Perro("",1,"","");
		
		perro1.nombre ="Patitas";
		perro1.edad = 3;
		perro1.raza = "Husky";
		perro1.tamaño = "Mediano";
		
		perro1.presentacion();
		perro1.ladrar();
		perro1.morder();
		
		System.out.println();		
		System.out.println("Bueno te presento otro, nomás te mordió poquito");
		System.out.println();
		
		Perro perro2 = new Perro("",1,"","");
		
		perro2.nombre ="Kukis";
		perro2.edad = 2;
		perro2.raza = "Dalmata";
		perro2.tamaño = "Grande";
		
		perro2.presentacion();
		perro2.ladrar();
		perro2.morder();
		System.out.println();
		
		Perro.mensaje();
		

	}//Fin del main

}//Fin de la clase
