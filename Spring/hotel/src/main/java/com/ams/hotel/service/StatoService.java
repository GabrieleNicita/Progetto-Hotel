package com.ams.hotel.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.Stato;
import com.ams.hotel.repository.StatoRepository;
import com.ams.hotel.service.interfacce.IStatoService;

@Service
public class StatoService implements IStatoService {
	@Autowired
	StatoRepository sRepository;

	@Override
	public Optional<Stato> stato(Integer i) {
		return sRepository.findById(i);
	}
	
	
}
