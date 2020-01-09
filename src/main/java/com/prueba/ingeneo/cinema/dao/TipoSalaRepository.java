package com.prueba.ingeneo.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.ingeneo.cinema.model.MaximoSillas;
import com.prueba.ingeneo.cinema.model.TipoSala;
/**
 * clase que implementa el metodo findAll para el tipoSala
 * @author santi
 *
 */
public interface TipoSalaRepository extends JpaRepository<TipoSala, Long> {
	
	/**
	 * metodo findAll que extiende de la super clase JPAREpository 
	 */
	List<TipoSala> findAll();
}
