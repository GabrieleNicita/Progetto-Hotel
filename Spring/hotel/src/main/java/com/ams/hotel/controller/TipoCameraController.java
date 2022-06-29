package com.ams.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.hotel.Model.TipoCamera;
import com.ams.hotel.service.interfacce.ITipoCameraService;

@Controller
@RequestMapping("/camera")
public class TipoCameraController {
	@Autowired
	ITipoCameraService tcService;
	
	@GetMapping(path="/tipo")
	public @ResponseBody List<TipoCamera> tipoCamere () {
		return tcService.all();
		}
	
}
