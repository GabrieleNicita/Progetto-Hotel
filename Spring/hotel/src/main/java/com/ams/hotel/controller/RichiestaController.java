package com.ams.hotel.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.hotel.Model.Richiesta;
import com.ams.hotel.service.interfacce.IRichiestaService;


@Controller
@RequestMapping("/richieste")
public class RichiestaController {
	
	@Autowired
	IRichiestaService rService;	
	
	@GetMapping(path="/")
	public @ResponseBody List<Richiesta> showCamera () {
		return rService.all();
	}
	
}
