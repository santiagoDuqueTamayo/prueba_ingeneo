/**
 * 
 */
package com.prueba.ingeneo.cinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.ingeneo.cinema.model.MaximoSillas;
import com.prueba.ingeneo.cinema.model.TipoSala;
import com.prueba.ingeneo.cinema.service.SalaService;
import com.prueba.ingeneo.cinema.service.TipoSalaService;

/**
 * clase que  representa un servicio a consumir para el tipo de sala
 * @author santi
 *
 */
@RestController
public class TipoSalaController {
	/**
	 * atributo que representa una instancia de tiposalaService para utilizar el metodo
	 * findAll definido en dicha clase
	 */
	@Autowired
	protected TipoSalaService tipoSillaService;
	/**
	 * metodo que permite encontrar el tipo de sala requerido
	 * @return
	 */
	@RequestMapping(value="/buscarTipoSala", method = RequestMethod.GET)
	public List <TipoSala> buscarTipoSala() {
		return tipoSillaService.findAll();
	}
}
