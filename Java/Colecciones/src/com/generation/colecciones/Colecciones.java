package com.generation.colecciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		
		/***List-ArrayList***/
		System.out.println("\tList --- ArrayList");
		List<String> miArray = new ArrayList<String>();
		
		miArray.add("Vivi");
		miArray.add("Ana");
		miArray.add("Viviana");
		miArray.add(1,"Viri");
		
		System.out.println(miArray);
		System.out.println(miArray.size());
		String elemento= miArray.remove(1); //Regresa el elemento borrado
		//miArray.remove("Ana"); //Regresa el booleano
		System.out.println(miArray);
		
		imprimir(miArray);
		//Colecciones.imprimir(miArray);
		
		int num1 = 10;     //Valor primitivo
		Integer num2 = 10; //Valor compuesto, referenciado
		System.out.println(num2.getClass());
		
		List <Integer> miArray2 = new ArrayList<Integer>();
		miArray2.add(311);
		miArray2.add(535);
		miArray2.add(7665334);
		
		imprimir(miArray2);

		/***SET***/
		System.out.println("\t Set --- HashSet");
		
		Set<String> miSet = new HashSet<String>();
		/*
		 *No acepta elementos duplicados
		 *No los guarda en un orden específico
		 *La colección que funciona más rápido 
		 */
		
		miSet.add("Adán");
		miSet.add("Adán");
		miSet.add("Lupe");
		miSet.add("Juan");
		miSet.add("Juan");
		miSet.add("A");
		
		miSet.remove("Lupe");
		System.out.println(miSet);
		imprimir(miSet);
		
		System.out.println(miSet.contains("Juan"));
		
					/***Map***/
		/*
		 * No acepta valores repetidos en llaves
		 * Las reemplaza
		 */
		System.out.println("\t Map --- HashMap");
		
		Map<String, Integer> miMap =new HashMap<String, Integer>();
		
		miMap.put("Valor 1", 1);
		miMap.put("Valor 2", 18);
		
		//imprimir(miMap); //No sirve
		System.out.println(miMap);
		System.out.println(miMap.values());
		System.out.println(miMap.keySet());
	
		System.out.println(miMap.get("Valor 1"));
		
		for(String key : miMap.keySet()) {
			System.out.println(key + " : " + miMap.get(key));
		}
		
	}//Fin del main
	
	public static void imprimir(Collection coleccion) {
		
		for (Object e : coleccion) {
			System.out.println("Elemento= "+e);			
		}//Fin del forEach
		
	}//Fin del método imprimir

}//Fin de la clase
