package generation.trecemay;
import java.util.Scanner;

public class ControlDeFlujo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es tu edad?: ");
		int edad = sc.nextInt();
		
		if(edad>= 18) {
			if(edad <50) {
				System.out.println("Eres un adulto mayor");
			}else {
				System.out.println("Eres mayor de edad");
			}
		}else {
			System.out.println("Eres menor de edad");
		}
		
		String mensaje = (edad >= 18) ? ("Eres mayor de edad") : ("Eres menor de edad x2");
		System.out.println(mensaje);
		
		////////////SWITCH CASE///////////
		
		System.out.println("¿En qué día estámos?: ");
		
		String dia = sc.next();
		
		//String dia = "Viernes";
		
		switch(dia) {
		case "Lunes" :
			System.out.println("5 minutos más");
			break;
		case "Martes" :
			System.out.println("No te cases ni te embarques");
			break;
		case "Miercoles" :
			System.out.println("Ombligo de la semana");
			break;
		case "Jueves" : 
			System.out.println("Viernes chiquito");
			break;
		case "Viernes" : 
			System.out.println("Chelas");
		}//Fin del switch case
	

	}//Fin del main

}//Fin de la clase
