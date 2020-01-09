package com.prueba.ingeneo.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.ingeneo.cinema.model.MaximoSillas;
/**
 * clase que implementa el metodo findAll
 * @author santi
 *
 */
public interface MaximoSillaRepository extends JpaRepository<MaximoSillas, Long> {
	/**
	 * metodo findAll que extiende de la super clase JPAREpository 
	 */
		List<MaximoSillas> findAll();
}
