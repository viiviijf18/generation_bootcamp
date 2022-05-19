package com.calculadora;

import java.util.Scanner;

public class PruebaCalculadora {
	public static void main(String[] args) {
		System.out.println("Vamos calcular :)");
		
		//Instanciar-Crear un objeto a partir de una clase
		Calculadora cal = new Calculadora();
		
		//Métodos con argumentos
		int sum=cal.suma(10, 20);
		System.out.println(sum);
		
		//Instanciar
		Areas calAreas= new Areas();
		
		calAreas.mensaje();
		
		int areaC = calAreas.areaCuadrado(10);
		System.out.println("El área del cuadrado de lado "+10+" es: "+areaC);
		
		double areaT = calAreas.areaTriangulo(5, 10);
		System.out.println("El área del triángulo es: "+areaT);
		
	}//Fin del main


}//Fin de la clase
