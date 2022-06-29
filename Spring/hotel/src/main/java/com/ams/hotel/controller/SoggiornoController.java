package com.ams.hotel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.hotel.Model.Prenotazione;
import com.ams.hotel.Model.Soggiorno;
import com.ams.hotel.service.interfacce.IPrenotazioneService;
import com.ams.hotel.service.interfacce.ISoggiornoService;
import com.ams.hotel.service.interfacce.IStatoService;

@Controller
@RequestMapping("/soggiorno")
public class SoggiornoController {
	@Autowired
	ISoggiornoService sService;
	@Autowired
	IPrenotazioneService pService;
	@Autowired
	IStatoService stService;
	
	
	@DeleteMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},path="/disdetta")
	public @ResponseBody void disdetta (@RequestBody Soggiorno s) {
		 Prenotazione p= sService.sogg(s.getIdSoggiorno()).getPrenotazione();
		 p.setStato(stService.stato(4).get());
		 pService.cambiaStato(p);
		 sService.remove(s.getIdSoggiorno());
		
	}
}
