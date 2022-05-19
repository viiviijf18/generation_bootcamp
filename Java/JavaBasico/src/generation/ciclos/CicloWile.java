package generation.ciclos;

import javax.swing.JOptionPane;

public class CicloWile {

	public static void main(String[] args) {
		// WHILE
		
		/*int condicion =  0;
		
		while(condicion < 5) {
			System.out.println("Hola");
			condicion++;
		}//Fin del while*/
		
		//VERIFICAR CONSTRASEÑA
		String clave = "Pedro";
		String comparacion = "";
		
		while(clave.equals(comparacion) != true) {
			comparacion = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if(clave.equals(comparacion) != true) {
				System.out.println("La contraseñ ES INCORRECTA");
				
			}//Fin del if
			
		}//Fin del whille2
		
		System.out.println("La contraseña es correcta");
		
	}//Fin del main
	
}//Fin de la clase
