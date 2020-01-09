package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Silla")
@Access(AccessType.FIELD)
public class Silla  implements Serializable{

	/**
	 * atributo que representa el id de serializacion de la clase
	 */
	private static final long serialVersionUID = -4239293834214372758L;
	
	/**
	 * atributo que representa el id de la clase silla
	 */
	private Long id; 
	/**
	 * atributo que representa la letra con la que es identificada una silla
	 */
	private String letraFila;
	/**
	 * atributo que representa el numero de una silla dentro de la fila
	 */
	private Integer noSilla;
	/**
	 * Enumeracion que representa el estado de una silla
	 */
	private EstadoSillaEnum estadoSilla;

}
