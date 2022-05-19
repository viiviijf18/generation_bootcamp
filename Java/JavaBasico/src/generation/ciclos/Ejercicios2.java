package generation.ciclos;

import java.util.Scanner;

public class Ejercicios2 {

	public static void main(String[] args) {
		System.out.println("introduce un correo:");
		Scanner scn = new Scanner(System.in);
		String correo = scn.nextLine();
		scn.close();
		
		///////////METODO 1//////////
//		boolean valido=false;
//		       
//		for(int i=0;i<correo.length()-1;i++) {
//			if(correo.charAt(i)==64) {
//				valido=true;
//		     }//Fin del if
//		 }//Fin del for
//		
//		 if(valido) {
//			 System.out.println("Este es un correo valido");
//		 }else {
//				 System.out.println("Este es NO un correo valido");
//		 }//Fin del if-else
		
		
		/////////MÉTODO 2///////////////
		
//		if(correo.indexOf('@')==-1) {
//			System.out.println("Este es NO un correo valido");
//		}else {
//				System.out.println("Este es un correo valido");
//      }//Fin del if-else
		
		//////////////////MÉTODO 3//////////////
        
        if(correo.contains("@")){
            System.out.println("Este es un correo valido");
        }else {
            System.out.println("Este es un correo NO valido");
        }//Fin del if-else
		
	}//Fin del main

}//Fin de la clase
