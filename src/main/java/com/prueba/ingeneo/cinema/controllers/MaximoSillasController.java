package com.prueba.ingeneo.cinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.ingeneo.cinema.model.MaximoSillas;
import com.prueba.ingeneo.cinema.service.MaximoSillasService;
import com.prueba.ingeneo.cinema.util.RestResponse;

@RestController
public class MaximoSillasController {
	
	@Autowired
	protected MaximoSillasService maximoSillasService;
	
	@RequestMapping(value="/buscarMaximoSillas", method = RequestMethod.GET)
	public List <MaximoSillas> buscarMaximoSillas() {
		return maximoSillasService.findAll();
	}
}
