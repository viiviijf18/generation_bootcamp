package com.generation.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = null;
		
		float division=0;
		
		/*** try-catch-finally ***/
		try {
			 division = num1/num2;		
		}catch(ArithmeticException ex){
			division = 0.0f;
			System.out.println("Error: "+ex.getMessage());			
		}catch(NullPointerException ex) {
			division = 0.0f;
			num2 = 0;
			System.out.println("Error: " + ex.getMessage());
		}finally {
			System.out.println("El valor de división es = "+division);
		}//Fin del try-catch-finally
		
	}//Fin del main

}//Fin de la clase
