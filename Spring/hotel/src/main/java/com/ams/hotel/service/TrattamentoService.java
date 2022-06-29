package com.ams.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.Trattamento;
import com.ams.hotel.repository.TrattamentoRepository;
import com.ams.hotel.service.interfacce.ITrattamentoService;

@Service
public class TrattamentoService implements ITrattamentoService {
	@Autowired
	TrattamentoRepository tRepository;
	
	@Override
	public List<Trattamento> trattamenti() {
		return (List<Trattamento>)tRepository.findAll();
	}

	@Override
	public Optional<Trattamento> trattamento(Integer id) {
		
		return tRepository.findById(id);
	}

	

}
