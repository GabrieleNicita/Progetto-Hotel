package com.ams.hotel.repository;

import java.sql.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.ams.hotel.Model.Camera;
import com.ams.hotel.Model.Prenotazione;
import com.ams.hotel.Model.TipoCamera;


public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer> {
		
	@Query( " FROM Camera as c WHERE c.tipoCamera=:tipoC "
			+ "AND c.numeroCamera not in (SELECT p.camera FROM Prenotazione as p "
			+ "INNER JOIN Camera as c on p.camera=c.numeroCamera "
			+ "WHERE ((p.inizioPerno>=:inizio AND p.finePerno<=:fine) OR (p.inizioPerno BETWEEN :inizio AND :fine) OR (p.finePerno BETWEEN :inizio AND :fine)) AND c.tipoCamera=:tipoC AND p.stato!=4)")
		
	List<Camera> findByNumeroCamera(@Param("inizio") Date inizP,@Param("fine") Date finP,@Param("tipoC")TipoCamera t);
	
	
}
