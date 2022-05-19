package com.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Perro {
	
	/*****ATRIBUTOS*****/
	private String nombre;
	private String raza;
	private String tamanio;
	private int edad;
	private int anios;
	String color;
	
	private int id;
	private static int contador;
	
	private static Map<Integer, String> humano = new HashMap<Integer, String>();

	/*****Constructor*****/
	public Perro(String nombre, String raza, String tamanio, int edad, int anios, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.anios = anios;
		this.color = color;
		this.id = ++Perro.contador;
	}
	
	/*****Getters y setters*****/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setHumano(String value) {
		Perro.humano.put(this.id, value) ;
	}

	/***Método toString***/
	//Sobreescritura de métodos
	@Override
	public String toString() {
		return "Perro [id="+ id +", nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + ", anios="
				+ anios + ", color=" + color + "]";
	}
	
	/*****Métodos*****/

	public static String buscarHumano(Integer key) {
		return "El humano del perro con id= "+ key + " es: " + humano.get(key);
	}

	public void comer() {
		System.out.println(this.nombre + " está comiendo, no lo interrumpas");
	}
	public void dormir() {
		System.out.println(this.nombre + " está durmiendo, no molestes");
	}
	public void sentar() {
		System.out.println(this.nombre + " se sentó, dejalo en paz");
	}
	public void correr() {
		System.out.println(this.nombre + " está corriendo, no molestes");
	}
	

}//Fin de la clase
