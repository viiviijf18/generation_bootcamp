package com.generation.arreglos;

import java.util.Arrays;

public class Arreglos {
	public static void main(String[] args) {
		
		int[] arrNumeros = new int[5];
		
		System.out.println();
		//System.out.println(Arrays.toString(arrNumeros));
		
		for(int i=0; i<arrNumeros.length ; i++) {
			arrNumeros[i]=2*i;
			System.out.print(arrNumeros[i]+ ", ");
		}
		System.out.println();
		
		/*******FOR EACH****/
		
		int conteo=0;
		for(int elemento : arrNumeros) {
			conteo++;
			System.out.println("Elemento "+conteo+ " = "+ elemento);
		}//Fin del for each
		
		/***Arreglo que guarda objetos***/
		Persona persona1 = new Persona("Viivii",26);
		Persona persona2 = new Persona("Ana",20);
		
		//Object arrPersonas[] = new Object[3];
		Persona arrPersonas[] = new Persona[3];
		
		arrPersonas[0] = persona1;
		arrPersonas[1] = persona2;
		arrPersonas[2] = new Persona("Viviana", 22);
		
		System.out.println(Arrays.toString(arrPersonas));;
		
		for(Persona elemento : arrPersonas) {
			System.out.println(elemento.nombre + " - "+elemento.edad);
		}
		/***Arreglos literales***/
		
		String[] arrString = {"Hola", "nuevo", "amigo"};
		System.out.println(Arrays.toString(arrString));
		

			
		
	}//Fin del main

}//Fin de la cla
