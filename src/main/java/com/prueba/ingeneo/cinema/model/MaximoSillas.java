/**
 * 
 */
package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author santi
 *
 */
@Entity
@Table(name=" MaximoSilla")
@Access(AccessType.FIELD)
public class MaximoSillas implements Serializable {

	/**
	 * atributo que representa el id de serializacion de la clase MaximoSillas
	 */
	private static final long serialVersionUID = -3912811231819627035L;

	/**
	 * atributo que representa el id de la clase maximosillas
	 */
	private Long id;
	
	/**
	 * atributo que representa la cantidad maxima de sillas por cada fila
	 */
	private Integer maximoSillasPorFila;
}
