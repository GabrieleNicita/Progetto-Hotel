package com.ams.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.TipoCamera;
import com.ams.hotel.repository.TipoCameraRepository;
import com.ams.hotel.service.interfacce.ITipoCameraService;

@Service
public class TipoCameraService implements ITipoCameraService {
	
	@Autowired
	TipoCameraRepository tcRepository;
	
	@Override
	public List<TipoCamera> all() {
		return (List<TipoCamera>) tcRepository.findAll();
	}

}
