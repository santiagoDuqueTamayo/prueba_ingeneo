package com.prueba.ingeneo.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.ingeneo.cinema.dao.MaximoSillaRepository;
import com.prueba.ingeneo.cinema.dao.SalasRepository;
import com.prueba.ingeneo.cinema.model.MaximoSillas;
import com.prueba.ingeneo.cinema.model.Sala;

@Service
public class MaximoSillasImpl implements MaximoSillasService {
	@Autowired
	protected MaximoSillaRepository maximoSillasRepository;

	@Override
	public List<MaximoSillas> findAll() {
		
		return this.maximoSillasRepository.findAll();
	}
	
}
