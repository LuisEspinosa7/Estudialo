/**
 * 
 */
package com.software.estudialo.entities;

// TODO: Auto-generated Javadoc
/**
 * The Class Categoria.
 *
 * @author LUIS
 */
public class Categoria {

	/** The id. */
	private int id;
	
	/** The nombre. */
	private String nombre;
	
	/** The descripcion. */
	private String descripcion;
	
	

	/**
	 * Instantiates a new categoria.
	 */
	public Categoria() {
		super();
	}

	/**
	 * Instantiates a new categoria.
	 *
	 * @param id the id
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 */
	public Categoria(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
