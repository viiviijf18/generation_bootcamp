package generation.ciclos;

import javax.swing.JOptionPane;

public class CicloDoWhile {

	public static void main(String[] args) {
		String comparacion = "";
		String clave = "Pedro";
		
		do {
			
			comparacion = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if(clave.equals(comparacion) != true) {
				System.out.println("La contraseñ ES INCORRECTA");
					
			}//Fin del if
			
		}while(clave.equals(comparacion));
		
		System.out.println("La contraseña es correcta");

	}//Fin del main

}//Fin de la clase

/**
 * Consejo: Comenten su código, al menos sus llaves
             }//Fin del while
       }//Fin del main
   }//Fin de la clase

}//Fin de la clase*/
