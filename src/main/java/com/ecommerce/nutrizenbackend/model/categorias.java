package com.ecommerce.nutrizenbackend.model;

public class categorias {

	private int id_categoria;
	private String nombre_categoria;
	private static int total= 0;
	
	public categorias(String nombre_categoria) {
		super();
		total++;
		this.id_categoria=total;
		this.nombre_categoria = nombre_categoria;
	}//constructor
	
	public int getId_categoria() {
		return id_categoria;
	}//getId
	public String getNombre_categoria() {
		return nombre_categoria;
	}//getNombre
	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}//setNombre
	@Override
	public String toString() {
		return "categorias [nombre_categoria=" + nombre_categoria + "]";
	}//toString
	
	
	
	
	
	
}//class categorias
