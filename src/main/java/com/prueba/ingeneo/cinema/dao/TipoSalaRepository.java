package com.prueba.ingeneo.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.ingeneo.cinema.model.MaximoSillas;
import com.prueba.ingeneo.cinema.model.TipoSala;

public interface TipoSalaRepository extends JpaRepository<TipoSala, Long> {

	List<TipoSala> findAll();
}
