package generation.trecemay;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de la operacion a realizar"); 
		System.out.println("1) Suma 2) Resta 3) Multiplicacion 4) Division"); 
		int opcion = sc.nextInt(); 
		System.out.println("Introduce el primer numero: "); 
		int num1 = sc.nextInt(); 
		System.out.println("Introduce el segundo numero: "); 
		int num2 = sc.nextInt();
		
		int resultado = 0;
		
		switch (opcion) {
		case 1:
			System.out.println("Elegiste suma");
			resultado = num1+num2;
			System.out.println("El resultado de la suma es : "+ resultado);
			break;
		case 2:
			System.out.println("Elegiste resta");
			resultado = num1-num2;
			System.out.println("El resultado de la resta es : "+ resultado);
			break;
		case 3:
			System.out.println("Elegiste multiplicación");
			resultado = num1*num2;
			System.out.println("El resultado de la multiplicación es : "+ resultado);
			break;
		case 4:
			System.out.println("Elegiste división");
			resultado = num1/num2;
			System.out.println("El resultado de la división es : "+ resultado);
			break;
		default:
			System.out.println("La opción no es válida");
		
		
		}//Fin del switch
		
	}//Fin del main

}//Fin de la clase
