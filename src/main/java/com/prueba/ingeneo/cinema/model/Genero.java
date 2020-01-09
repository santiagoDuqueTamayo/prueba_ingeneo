package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Genero")
@Access(AccessType.FIELD)
public class Genero implements Serializable {

	/**
	 * atributo que repsenta el id de serializacion de la clase genero
	 */
	private static final long serialVersionUID = 8252973469512418436L;
	/**
	 * atributo que representa el id de de un genero
	 */
	private String id;
	/**
	 * atributo que representa el genero de una pelicula
	 */
	private String genero;
	
}
