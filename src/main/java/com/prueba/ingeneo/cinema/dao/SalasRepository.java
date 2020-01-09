package com.prueba.ingeneo.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.ingeneo.cinema.model.Sala;
/**
 * clase que implementa el metodo save para la sala
 * @author santi
 *
 */
public interface SalasRepository extends JpaRepository<Sala, Long>{
	
	/**
	 * atributo que repsenta la implemnetacion del metodo save que extiende de JPAREpostory
	 */
	@SuppressWarnings("unchecked")
	Sala save(Sala sala);
}
