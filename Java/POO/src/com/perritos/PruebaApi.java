package com.perritos;

import java.util.Scanner;

public class PruebaApi {

	public static void main(String[] args) {
		
		String nombre = "Viivii";
		System.out.println(nombre);
		
		String apellido1= new String("Juárez");
		System.out.println(apellido1);
		
		System.out.println(nombre.charAt(5));
		
		Integer.parseInt("50");
		
		/*****Scanner******/
		Scanner sc = new Scanner(System.in);
		sc.next();
		sc.close();
		
		/****Math***Tiene métodos estáticos*****/
		Math.random();

	}//Fin del main

}//Fin de la clase
