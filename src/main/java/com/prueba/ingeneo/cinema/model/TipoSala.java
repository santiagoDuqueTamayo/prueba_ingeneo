package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TipoDeSala")
@Access(AccessType.FIELD)
public class TipoSala implements Serializable{

	/**
	 * atributo que representa el id de serializacion
	 */
	private static final long serialVersionUID = 4428266695459866818L;

	/**
	 *atributo que repsenta el id del tipo de sala
	 */
	private String id;
	/**
	 * atributo que repsenta el tipoDeSala
	 */
	private String tipoSala;
	
	//TODO relaciones
}
