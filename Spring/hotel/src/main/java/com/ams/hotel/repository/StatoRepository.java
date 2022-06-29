package com.ams.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.ams.hotel.Model.Stato;

public interface StatoRepository extends CrudRepository<Stato, Integer> {
	Stato findByIdStato(Integer i);
}
