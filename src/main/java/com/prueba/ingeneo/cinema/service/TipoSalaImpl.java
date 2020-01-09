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
 *Clase que representan los metodos a implementar por la interface 
 *TipoSalaService
 * @author santi
 *
 */
@Service
public class TipoSalaImpl implements TipoSalaService {
	/**
	 * atributo que representa una instancia de TipoSalaRepository
	 */
	@Autowired
	protected TipoSalaRepository tipoSalaRepository;
	/**
	 * implemntacion del metodo FindAll de la interface tipoSalaService
	 */
	@Override
	public List<TipoSala> findAll() {
		// TODO Auto-generated method stub
		return this.tipoSalaRepository.findAll();
	}

}
