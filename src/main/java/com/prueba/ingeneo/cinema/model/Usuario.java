package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
@Access(AccessType.FIELD)
public class Usuario implements Serializable{

	/**
	 * atributo que representa la serializacion del usuario
	 */
	private static final long serialVersionUID = 2840005950974645423L;
 
	/**
	 * atributo que representa el id de un usuario
	 */
	private String id;
	/**
	 * atributo que representa el nombre de un usuario , debe ser autogenerado
	 */
	private String nombre;
	/**
	 * atributo que repsenta la cedula de un usuario
	 */
	private String cedula;
	 /**
	  * Atributo que representa el tipo de usuario
	  */
	private TipoUsuarioEnum usuarioEnum;
}
