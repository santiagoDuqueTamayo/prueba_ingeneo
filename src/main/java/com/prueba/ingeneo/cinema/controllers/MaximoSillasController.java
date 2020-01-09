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
/**
 * clase que representa los servicios que voy a consumir desde el front end
 * @author santi
 *
 */
@RestController
public class MaximoSillasController {
	/**
	 * atributo que representa una instancia de maximoSillasService para definir
	 * el servicio a consumir
	 */
	@Autowired
	protected MaximoSillasService maximoSillasService;
	/**
	 * metodo que permite sacar el registro con el maximo de sillas
	 * @return
	 */
	@RequestMapping(value="/buscarMaximoSillas", method = RequestMethod.GET)
	public List <MaximoSillas> buscarMaximoSillas() {
		return maximoSillasService.findAll();
	}
}
