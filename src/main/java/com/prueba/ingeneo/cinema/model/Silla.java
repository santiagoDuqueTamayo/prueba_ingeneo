package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * clase que representa una tabla de la base de datos
 * @author santi
 *
 */
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
	
	/**
	 * atributo que repsenta la foranea de una sala
	 */
	@ManyToOne
	private Sala sala;
	
	/**
	 * atributo que representa la asociacion de una silla a una sola resera
	 */
	@OneToMany
	private Reserva reserva;
	/**
	 * constructor de la clase con todos  atributos de la clase
	 * @param id
	 * @param letraFila
	 * @param noSilla
	 * @param estadoSilla
	 * @param sala
	 * @param reserva
	 */
	public Silla(Long id, String letraFila, Integer noSilla, EstadoSillaEnum estadoSilla, Sala sala, Reserva reserva) {
		super();
		this.id = id;
		this.letraFila = letraFila;
		this.noSilla = noSilla;
		this.estadoSilla = estadoSilla;
		this.sala = sala;
		this.reserva = reserva;
	}
	/**
	 * constructor sin atributos
	 */
	public Silla() {
		super();
	}
	/**
	 * @return the id
	 */
	@Id
	@Column(name = "idSilla")
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
	 * @return the letraFila
	 */
	@Column(name="letraFila")
	public String getLetraFila() {
		return letraFila;
	}
	/**
	 * @param letraFila the letraFila to set
	 */
	public void setLetraFila(String letraFila) {
		this.letraFila = letraFila;
	}
	/**
	 * @return the noSilla
	 */
	@Column(name="noSilla")
	public Integer getNoSilla() {
		return noSilla;
	}
	/**
	 * @param noSilla the noSilla to set
	 */
	public void setNoSilla(Integer noSilla) {
		this.noSilla = noSilla;
	}
	/**
	 * @return the estadoSilla
	 */
	@Column(name="estado")
	@Enumerated(value = EnumType.STRING)
	public EstadoSillaEnum getEstadoSilla() {
		return estadoSilla;
	}
	/**
	 * @param estadoSilla the estadoSilla to set
	 */
	public void setEstadoSilla(EstadoSillaEnum estadoSilla) {
		this.estadoSilla = estadoSilla;
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
	/**
	 * @return the reserva
	 */
	public Reserva getReserva() {
		return reserva;
	}
	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	
	
	
}
