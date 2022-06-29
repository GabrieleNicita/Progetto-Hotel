package com.ams.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.Soggiorno;
import com.ams.hotel.repository.SoggiornoRepository;
import com.ams.hotel.service.interfacce.ISoggiornoService;
@Service
public class SoggiornoService implements ISoggiornoService {
	@Autowired
	SoggiornoRepository sRepository;
	
	@Override
	public Soggiorno add(Soggiorno s) {
		return sRepository.save(s);
	}

	@Override
	public void remove(Integer i) {
		sRepository.deleteById(i);
	}

	@Override
	public Soggiorno sogg(Integer i) {
		return sRepository.findById(i).get();
	}


	
	
}
