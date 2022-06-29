package com.ams.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.Richiesta;
import com.ams.hotel.repository.RichiestaRepository;
import com.ams.hotel.service.interfacce.IRichiestaService;

@Service
public class RichiestaService implements IRichiestaService {
	@Autowired
	RichiestaRepository rRepository;
	
	@Override
	public Richiesta add(Richiesta r) {
		return rRepository.save(r);
	}

	@Override
	public List<Richiesta> all() {	
		return (List<Richiesta>)rRepository.findAll();
	}
	
}
