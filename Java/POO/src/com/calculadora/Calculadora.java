package com.calculadora;

public class Calculadora {
	
	
	////////OPERACIONES//////////
	
	public int suma(int num1, int num2) {
		return num1+num2;
	}
	public int resta(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	public double dividir(double num1, double num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			System.out.println("División inválida");
			return -1;
		}
	}
	
	
}//Fin de la clase
