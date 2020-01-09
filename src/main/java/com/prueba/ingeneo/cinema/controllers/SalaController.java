/**
 * 
 */
package com.prueba.ingeneo.cinema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.ingeneo.cinema.model.Sala;
import com.prueba.ingeneo.cinema.service.SalaService;
import com.prueba.ingeneo.cinema.util.RestResponse;

/**
 * Creacion del servicio rest 
 * @author santi
 *
 */
@RestController
public class SalaController {

	@Autowired
	protected SalaService salaService;
	
	
	protected ObjectMapper objectMapper;
	
	@RequestMapping(value="/guardarOActualizar", method = RequestMethod.POST)
	public RestResponse guardaroActualizar(@RequestBody String salaJson) throws JsonMappingException, JsonProcessingException {
		objectMapper= new ObjectMapper();
		Sala sala= this.objectMapper.readValue(salaJson, Sala.class);
		if (validar(sala)==false) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "el id no puede ser null");
		}
		salaService.save(sala);
		return new RestResponse(HttpStatus.OK.value(),"operacion extiosa");
	}
	
	private boolean validar(Sala sala) {
		boolean esValido=true;
		if(sala.getId()==null) {
			esValido=false;
		}
		return esValido;
	}
}
