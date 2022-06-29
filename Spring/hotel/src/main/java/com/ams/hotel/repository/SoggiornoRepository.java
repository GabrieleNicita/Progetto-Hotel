package com.ams.hotel.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.hotel.Model.Soggiorno;

public interface SoggiornoRepository extends JpaRepository<Soggiorno, Integer> {
	
}
