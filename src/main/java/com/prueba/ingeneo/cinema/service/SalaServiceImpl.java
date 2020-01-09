/**
 * 
 */
package com.prueba.ingeneo.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.ingeneo.cinema.dao.SalasRepository;
import com.prueba.ingeneo.cinema.model.Sala;

/**
 * @author santi
 *
 */
@Service
public class SalaServiceImpl implements SalaService {
	@Autowired
	protected SalasRepository salaRepository;

	@Override
	public Sala save(Sala sala) {
		// TODO Auto-generated method stub
		return this.salaRepository.save(sala);
	}
}
