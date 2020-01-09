package com.prueba.ingeneo.cinema.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Reserva")
@Access(AccessType.FIELD)
public class Reserva implements Serializable{

	/**
	 * atributo que representa el id de serializacion de la reserva
	 */
	private static final long serialVersionUID = 6291563082273686986L;
	/**
	 * atributo que representa el id de una reserva
	 */
	private Long id;
	/**
	 * Lista que representa la cantidad de sillas que tiene una reserva
	 */
	@OneToMany(mappedBy = "ciudad")
	private List <Silla> sillas;
	
	/**
	 * atributo que representa si una reserva ha sido pagada
	 */
	private EstadoPagoEnum estadoPago;
	
	/**
	 *  atributo que representa la hora en la que fue hecha una reserva
	 */
	private String horaReserva;
	/**
	 * atributo que representa  si una reserva esta activa
	 */
	private EstadoReservaEnum estadoReserva;
}
