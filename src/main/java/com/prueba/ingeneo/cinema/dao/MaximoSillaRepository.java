package com.prueba.ingeneo.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.ingeneo.cinema.model.MaximoSillas;

public interface MaximoSillaRepository extends JpaRepository<MaximoSillas, Long> {

		List<MaximoSillas> findAll();
}
