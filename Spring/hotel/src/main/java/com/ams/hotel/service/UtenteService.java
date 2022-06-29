package com.ams.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.Utente;
import com.ams.hotel.repository.UtenteRepository;
import com.ams.hotel.service.interfacce.IUtenteService;

@Service
public class UtenteService implements IUtenteService {
	@Autowired
	UtenteRepository uRepository;

	@Override
	public Utente add(Utente u) {
		return uRepository.save(u);
	}

	@Override
	public List<Utente> all() {
		return (List<Utente>) uRepository.findAll();
	}
	
	
	
}
