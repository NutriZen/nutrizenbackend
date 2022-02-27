package com.ecommerce.nutrizenbackend.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private double precio;
	
	
	//constructor fields
		//constructor vacio
		//Geters and setters
		//to string
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param uRL_imagen
	 * @param precio
	 */
	public Producto(Long id, String nombre, String descripcion, String uRL_imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.precio = precio;
	}//Producto
	
	public Producto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_imagen() {
		return URL_imagen;
	}

	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen="
				+ URL_imagen + ", precio=" + precio + "]";
	}//toString
	
	
	
	
}//Producto
