package com.ams.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ams.hotel.Model.Trattamento;

import com.ams.hotel.service.interfacce.ITrattamentoService;


@Controller
@RequestMapping("/trattamento")
public class TrattamentoController {
	@Autowired
	ITrattamentoService tService;

	
	@GetMapping(path="/")
	public @ResponseBody List<Trattamento> all () {
			return tService.trattamenti(); 
		 }

	
}
