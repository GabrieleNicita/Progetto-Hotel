package com.ams.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.hotel.Model.Camera;
import com.ams.hotel.Model.Richiesta;
import com.ams.hotel.service.interfacce.ICameraService;
import com.ams.hotel.service.interfacce.IPrenotazioneService;

@Controller
@RequestMapping("/camera")
public class CameraController {
	@Autowired
	ICameraService cService;
	@Autowired
	IPrenotazioneService pService;
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},path="/add")
	public @ResponseBody Camera addUser (@RequestBody Camera c) {
		return cService.add(c);
	}
	@GetMapping(path="/")
	public @ResponseBody List<Camera> all () {
		return cService.all();
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},path="/libere")
	public @ResponseBody List<Camera> camere (@RequestBody Richiesta r) {
		 return pService.camereLibere(r.getTipo(), r.getInizio(), r.getFine());
		 }
	
	
}
