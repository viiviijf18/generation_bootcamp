package com.perritos;

public class Perro {
	
	/*************ATRIBUTOS O PROPIEDADES*****************/
	String nombre;
	int edad;
	String raza;
	String tamaño;
	
	/*********CONSTRUCTOR*************/
	public Perro(String nombre,	int edad, String raza, String tamaño) {
		this.nombre = nombre;
		this.edad= edad;
		this.raza = raza;
		this.tamaño = tamaño;
	}
	
	/************MÉTODOS*****************/
	
	public void presentacion() {
		System.out.println("Te presento a mi perro "+nombre+" con edad perruna de "+edadPerruna()+" años.");
	}
	public void ladrar() {
		System.out.println("GUAU GUAUUU!!!");
	}
	public void morder() {
		System.out.println("CHIN!!! Ya te mordió!!!");
	}
	public int edadPerruna() {
		return edad*7;
	}
	
	/************MÉTODOS ESTÁTICOS**************/
	
	public static void mensaje() {
		System.out.println("ADIOS Bye >:c Fue tu culpa...");
	}

}//Fin de la clase
