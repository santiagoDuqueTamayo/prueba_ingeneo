package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Sala")
@Access(AccessType.FIELD)
public class Sala implements Serializable{

	/**
	 * atributo que representa el id de serializacion de la clase sala
	 */
	private static final long serialVersionUID = -2356418191266296945L;
	/**
	 * atributo que repsenta el id de una sala
	 */
	private String id; 
	/**
	 * atributo que repsenta 
	 */
	//TODO
	//todas las relaciones
}
