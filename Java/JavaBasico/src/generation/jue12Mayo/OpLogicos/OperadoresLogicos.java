package generation.jue12Mayo.OpLogicos;

import java.util.Objects;

public class OperadoresLogicos {

	public static void main(String[] args) {
		//Operadores de asignación
		int num = 12;
		num = 45;
		num = -Integer.parseInt("18");
		System.out.println(num);
		
		//Operadores de comparación
		
		int num1, num2;
		
		num1=10;
		num2=20;
		
		System.out.println("num1: " +num1);
		System.out.println("num2: " + num2);
		
		System.out.println(num1 == num2);
		System.out.println(Objects.equals(num1,num2));
		
		//Operadores de comparación <, >, <=, >=
		int num3, num4;
		num3=15;
		num4=20;
		
		System.out.println(num3 < num4);
		
		if(num3 < num4) {
			System.out.println("Número 3 es mayor");
		}else {
			System.out.println("Número 3 es menor");
		}
		
		System.out.println(num3 != num4);
		
		boolean comparacion = num3 != num4;
		System.out.println(comparacion);
		
		//Operadores Lógicos
		//AND && ----> AMBOS VALORES TIENEN QUE SER IGUALES
		//OR ||  ----> SÓLO UNO NECESITA SER TRUE PARA DEOLVER TRUE
		//NOT !  ----> NIEGA EL VALOR
		
		System.out.println(true && true);
		System.out.println(false || false);
		System.out.println(!true && true);
		System.out.println(!(false && true));

		
	}//Fin del main

}//Fin de la clase
