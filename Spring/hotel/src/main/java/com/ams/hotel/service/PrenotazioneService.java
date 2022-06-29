package com.ams.hotel.service;


import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.Camera;
import com.ams.hotel.Model.Prenotazione;
import com.ams.hotel.Model.TipoCamera;
import com.ams.hotel.repository.PrenotazioneRepository;
import com.ams.hotel.service.interfacce.IPrenotazioneService;

@Service
public class PrenotazioneService implements IPrenotazioneService {
	@Autowired
	PrenotazioneRepository pRepository;
	
	@Override
	public Prenotazione add(Prenotazione p) {
		return pRepository.save(p);
	}

	@Override
	public  List<Prenotazione> all() {
		return pRepository.findAll();
	}

	@Override
	public Camera cameraLibera(TipoCamera t, Date in, Date fn) {
		List<Camera> cLIbere=pRepository.findByNumeroCamera(in,fn,t);
			return cLIbere.get(0); }


	@Override
	public List<Camera> camereLibere(TipoCamera t, Date in, Date fn) {
		return pRepository.findByNumeroCamera(in,fn,t);
	}

	@Override
	public Prenotazione cambiaStato(Prenotazione p) {
		return pRepository.save(p);
	}
	

}
