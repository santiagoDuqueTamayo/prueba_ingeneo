/**
 * 
 */
package com.prueba.ingeneo.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.ingeneo.cinema.dao.SalasRepository;
import com.prueba.ingeneo.cinema.model.Sala;

/**
 * clase que representa la implementacion de los metodos expuestos 
 * por la interface salaService
 * @author santi
 *
 */
@Service
public class SalaServiceImpl implements SalaService {
	/*
	 * atributo que repsenta una instancia de salasRepository
	 */
	@Autowired
	protected SalasRepository salaRepository;
	/**
	 * implementacion del metodo save 
	 */
	@Override
	public Sala save(Sala sala) {

		return this.salaRepository.save(sala);
	}
}
