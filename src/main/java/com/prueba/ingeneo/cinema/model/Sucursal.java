package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name="Sucursal")
@Access(AccessType.FIELD)
public class Sucursal implements Serializable{

	/**
	 * atributo que representa el serial de versializacion de la clase
	 */
	private static final long serialVersionUID = 7205601638600482975L;
	
	private Long id;
	private String nombre;
	private String direccion;
	//TODO
	// Todas las relaciones de las foraneas
	
	
	
}
