package com.prueba.ingeneo.cinema.service;

import java.util.List;

import com.prueba.ingeneo.cinema.model.MaximoSillas;
/**
 * Interface que define el servicio para maximo de sillas
 * @author santi
 *
 */
public interface MaximoSillasService {

	/**
	 * metodo  a implementar por maximoSillasImp
	 * @return
	 */
	List<MaximoSillas> findAll();

}
