package com.generation.calculadora;

public class Calculadora {
	
	/***Atributos o propiedades***/
	private int a;
	private int b;
	private int c;
	int resultado;
	
	/***Constructor***/
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}//Fin del constructor
	
	/***Polimorfismo***/
		
	public Calculadora(int a2, int b2, int c2) {
		this.a = a2;
		this.b = b2;
		this.c = c2;
	}

	public void sumar(int a, int b, int c) {
		resultado = a+b+c;
		System.out.println("El resultado de la suma es: "+ resultado);
	}
	
	/***Getters y Setters***/
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	/***Métodos***/
	
	public void sumar(int a, int b) {
		resultado = a+b;
		System.out.println("El resultado de la suma es: "+ resultado);
	}
	
}//Fin de la clase
