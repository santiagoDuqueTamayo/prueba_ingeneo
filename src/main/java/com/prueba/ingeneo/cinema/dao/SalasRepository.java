package com.prueba.ingeneo.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.ingeneo.cinema.model.Sala;

public interface SalasRepository extends JpaRepository<Sala, Long>{
	
	@SuppressWarnings("unchecked")
	Sala save(Sala sala);
}
