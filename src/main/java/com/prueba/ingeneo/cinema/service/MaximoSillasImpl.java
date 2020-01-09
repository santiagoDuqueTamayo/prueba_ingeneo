package com.prueba.ingeneo.cinema.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.ingeneo.cinema.dao.MaximoSillaRepository;
import com.prueba.ingeneo.cinema.dao.SalasRepository;
import com.prueba.ingeneo.cinema.model.MaximoSillas;
import com.prueba.ingeneo.cinema.model.Sala;

/**
 * clase que representa un service de spring data
 * @author santi
 *
 */
@Service
public class MaximoSillasImpl implements MaximoSillasService {
	/**
	 * atributo que representa una instancia de maximoSillasRepository
	 */
	@Autowired
	protected MaximoSillaRepository maximoSillasRepository;
	/**
	 * metodo que permite encontrar la lista con el registro del maximo de sillas
	 */
	@Override
	public List<MaximoSillas> findAll() {
		
		return this.maximoSillasRepository.findAll();
	}
	
}
