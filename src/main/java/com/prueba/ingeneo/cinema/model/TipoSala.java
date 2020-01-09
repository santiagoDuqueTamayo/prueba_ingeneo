package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Clase que representa la tabla en la base de datos TipoDeSala
 * @author santi
 *
 */
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
	private Long id;
	/**
	 * atributo que repsenta el tipoDeSala
	 */
	private String tipoSala;
	/**
	 * atributo que representa la foranea de una sala
	 */
	@ManyToOne
	private Sala sala;
	/**
	 * constructor de la clase TipoSala
	 * @param id
	 * @param tipoSala
	 * @param sala
	 */
	public TipoSala(Long id, String tipoSala, Sala sala) {
		super();
		this.id = id;
		this.tipoSala = tipoSala;
		this.sala = sala;
	}
	/**
	 * Constructor vacio de la clase tipoSala
	 */
	public TipoSala() {
		super();
	}
	/**
	 * metodo que permite acceder al id de la clase tipoSala
	 * @return the id
	 */
	@Id
	@Column(name = "idTipoDSala")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the tipoSala
	 */
	@Column(name="descripcion_tipo")
	public String getTipoSala() {
		return tipoSala;
	}
	/**
	 * @param tipoSala the tipoSala to set
	 */
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	/**
	 * @return the sala
	 */
	public Sala getSala() {
		return sala;
	}
	/**
	 * @param sala the sala to set
	 */
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	

}
