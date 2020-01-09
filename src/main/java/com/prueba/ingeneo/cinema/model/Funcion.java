package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
@Access(AccessType.FIELD)
public class Funcion implements Serializable {

	/**
	 * atributo que representa el id de serializacion de la clase funcion
	 */
	private static final long serialVersionUID = -1382307576678877659L;
	/**
	 * atributo que repsenta el id de la clase funcion
	 */
	private String id;
	/**
	 * atributo que repsenta
	 */

}
