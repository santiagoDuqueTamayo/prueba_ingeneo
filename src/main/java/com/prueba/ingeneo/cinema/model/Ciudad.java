package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Ciudad")
@Access(AccessType.FIELD)
public class Ciudad implements Serializable{

	/**
	 * atributo que representa el id de versialización de la clase ciudad
	 */
	private static final long serialVersionUID = -6209375441774124033L;

	/**
	 * atributo que representa el id d euna ciudad
	 */
	private String id;
	/**
	 * atributo que presenta el nombre de una ciudad
	 */
	
	private String nombreCiudad;
	/**
	 * lista que repsenta un listado de sucursales
	 */
	@OneToMany(mappedBy = "ciudad")
	private List<Sucursal> sucursales;
	//TODO
	//relaciones, gets y sets
	
}
