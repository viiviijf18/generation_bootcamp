package generation.ciclos;

public class CicloFor {
	public static void main(String[] args) {
		
		//continue && break
		
		for(int i=0; i<10; i++) {
			if(i%2 ==0) {
				continue; //Salta la iteración
			}//Fin del if
			System.out.println(i);
		
		}//Fin del for
		
	}//Fin del main

}//Fin de la clase
