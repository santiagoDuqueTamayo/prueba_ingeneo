package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.swing.Icon;

@Entity
@Table(name="Pelicula")
@Access(AccessType.FIELD)
public class Pelicula implements Serializable{

	/**
	 * atributo que representa el id de versializacion
	 */
	private static final long serialVersionUID = 3149552908278028224L;
	/**
	 * atributo que representa el id de una pelicula
	 */
	private String id;
	/**
	 * atributo que repsenta el idioma original de una pelicula
	 */
	private String nombreOriginal;
	/**
	 * atributo que representa el nombre traducido de una pelicula
	 */
	private String nombreTraducido;
	/**
	 * atributo que repsenta la fecha de estreno de una pelicula
	 */
	private LocalDate fechaEstreno;
	/**
	 * atributo que repsenta una imagen de portada de una pelicula
	 */
	private Icon imagen;
	/**
	 * atributo que representa la sinopsis de una pelicula
	 */
	private String sinopsis;
	
	//TODO 
	// relaciones
	
}
