package com.ams.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.hotel.Model.Camera;
import com.ams.hotel.Model.Prenotazione;
import com.ams.hotel.Model.Richiesta;
import com.ams.hotel.Model.Soggiorno;
import com.ams.hotel.service.interfacce.IPrenotazioneService;
import com.ams.hotel.service.interfacce.IRichiestaService;
import com.ams.hotel.service.interfacce.ISoggiornoService;
import com.ams.hotel.service.interfacce.IStatoService;
import com.ams.hotel.service.interfacce.ITrattamentoService;



@Controller
@RequestMapping("/prenota")
public class PrenotazioneController {
	
	@Autowired
	IPrenotazioneService pService;
	@Autowired
	IStatoService sService;
	@Autowired
	IRichiestaService rService;
	@Autowired
	ISoggiornoService soService;
	@Autowired
	ITrattamentoService tService;
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},path="/add/{id}")
	public @ResponseBody String addReq (@RequestBody Richiesta r,@PathVariable(value="id") Integer id) {
		
		 Camera camera=pService.cameraLibera(r.getTipo(), r.getInizio(), r.getFine());
		 rService.add(r);
		 Prenotazione prenotazione=new Prenotazione(r,camera,sService.stato(1).get(),tService.trattamento(id).get());
		 prenotazione=pService.add(prenotazione);
		 Soggiorno soggiorno=new Soggiorno(r.getUtente(),prenotazione);
		 soService.add(soggiorno);
		 return "Operazione avvenuta con successo";
		 }	


	@GetMapping(path="/")
	public @ResponseBody List<Prenotazione> prenotazioni () {
			return pService.all();
		 }
	
}
