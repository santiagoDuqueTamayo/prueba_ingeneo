package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * Entidad que representa la sala persistida en la base de datos
 * @autor santi
 */
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
	private Long id; 
	
	/**
	 * atributo que representa la lista de tipos que puede tener una sala
	 */
	@OneToMany(mappedBy = "sala")
	private List<TipoSala> TiposDeSalas;
	/**
	 * atributo que representa la lisa de sillas que puede tener una sala
	 */
	@OneToMany(mappedBy = "silla")
	private List<Silla>sillas;
	
	/**
	 * atributo que representa la asociacion de una sala a una sucursal
	 */
	@ManyToOne
	private Sucursal sucursal;
	/**
	 * Constructor con todos los atributos de la clase sala
	 * @param id
	 * @param tiposDeSalas
	 * @param sillas
	 * @param sucursal
	 */
	public Sala(Long id, List<TipoSala> tiposDeSalas, List<Silla> sillas, Sucursal sucursal) {
		super();
		this.id = id;
		TiposDeSalas = tiposDeSalas;
		this.sillas = sillas;
		this.sucursal = sucursal;
	}
	/**
	 * Constructor sin parametros de la clase sala
	 */
	public Sala() {
		super();
	}
	/**
	 * metodo que permite acceder al id de la clase sala
	 * @return the id
	 */
	@Id
	@Column(name = "idSala")
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
	 * @return the tiposDeSalas
	 */

	public List<TipoSala> getTiposDeSalas() {
		return TiposDeSalas;
	}
	/**
	 * @param tiposDeSalas the tiposDeSalas to set
	 */
	public void setTiposDeSalas(List<TipoSala> tiposDeSalas) {
		TiposDeSalas = tiposDeSalas;
	}
	/**
	 * @return the sillas
	 */
	public List<Silla> getSillas() {
		return sillas;
	}
	/**
	 * @param sillas the sillas to set
	 */
	public void setSillas(List<Silla> sillas) {
		this.sillas = sillas;
	}
	/**
	 * @return the sucursal
	 */
	public Sucursal getSucursal() {
		return sucursal;
	}
	/**
	 * @param sucursal the sucursal to set
	 */
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	/**
	 * metodo que permite hacer los hash de la clase
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TiposDeSalas == null) ? 0 : TiposDeSalas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sillas == null) ? 0 : sillas.hashCode());
		result = prime * result + ((sucursal == null) ? 0 : sucursal.hashCode());
		return result;
	}
	/*
	 * metodo que permite hacer la comparacion de los objetos
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		if (TiposDeSalas == null) {
			if (other.TiposDeSalas != null)
				return false;
		} else if (!TiposDeSalas.equals(other.TiposDeSalas))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sillas == null) {
			if (other.sillas != null)
				return false;
		} else if (!sillas.equals(other.sillas))
			return false;
		if (sucursal == null) {
			if (other.sucursal != null)
				return false;
		} else if (!sucursal.equals(other.sucursal))
			return false;
		return true;
	}
	/**
	 * metodo que permite generar el toString de la clase
	 */
	@Override
	public String toString() {
		return "Sala [id=" + id + ", TiposDeSalas=" + TiposDeSalas + ", sillas=" + sillas + ", sucursal=" + sucursal
				+ "]";
	}
	
	
	
	
}
