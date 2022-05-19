package generation.ciclos;

/*
 * adivina el número escribe un programa en java 
 * que te pida introducir un número y lo compare
 * con otro número que puede ser aleatorio o 
 * establecido por tí. mientras que el número 
 * no sea igual al establecido como base, el 
 * programa se seguirá ejecutando. una vez que 
 * ambos números sean iguales, el programa se 
 * detendrá y mostrará lo siguiente en consola:
 *  "felicidades, adivinaste el número."
 */

import javax.swing.JOptionPane;


public class Ejercicio1 {
    public static void main(String[] args) {

        int adivinar = (int) (Math.random()*(10-1));
        boolean salir = true;
        System.out.println(adivinar);

        while (salir){
            int input= Integer.valueOf(JOptionPane.showInputDialog("Introduce un numero"));
            if(input == adivinar){
                salir = false;
            }else{
                System.out.println("Numero incorrecto");
            }//Fin del else
            
        }//Fin del while
        
        System.out.println("Felicidades adivinaste el numero!!");
        
    }//Fin del main
}//Fin de la clase Ejercicio1


