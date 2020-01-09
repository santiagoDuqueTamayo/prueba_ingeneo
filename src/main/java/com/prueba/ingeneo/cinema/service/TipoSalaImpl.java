/**
 * 
 */
package com.prueba.ingeneo.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.ingeneo.cinema.dao.MaximoSillaRepository;
import com.prueba.ingeneo.cinema.dao.TipoSalaRepository;
import com.prueba.ingeneo.cinema.model.TipoSala;

/**
 * @author santi
 *
 */
@Service
public class TipoSalaImpl implements TipoSalaService {

	@Autowired
	protected TipoSalaRepository tipoSalaRepository;
	@Override
	public List<TipoSala> findAll() {
		// TODO Auto-generated method stub
		return this.tipoSalaRepository.findAll();
	}

}
