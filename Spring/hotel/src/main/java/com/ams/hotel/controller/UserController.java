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

import com.ams.hotel.Model.Utente;

import com.ams.hotel.service.interfacce.IUtenteService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUtenteService uService;

	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},path="/add")
	public @ResponseBody Utente addUser (@RequestBody Utente u) {
		return uService.add(u);
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<Utente> showCamera () {
		return uService.all();
	}
}
