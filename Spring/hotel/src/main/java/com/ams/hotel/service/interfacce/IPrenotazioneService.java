package com.ams.hotel.service.interfacce;

import java.sql.Date;

import java.util.List;
import java.util.Optional;

import com.ams.hotel.Model.Camera;
import com.ams.hotel.Model.Prenotazione;
import com.ams.hotel.Model.TipoCamera;



public interface IPrenotazioneService {

	Prenotazione add(Prenotazione p);
	List<Prenotazione> all();
	Camera cameraLibera(TipoCamera t,Date in,Date fn);
	List<Camera> camereLibere(TipoCamera t,Date in,Date fn);
	Prenotazione cambiaStato(Prenotazione p);
}
