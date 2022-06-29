package com.ams.hotel.service.interfacce;

import java.util.List;
import java.util.Optional;

import com.ams.hotel.Model.Trattamento;

public interface ITrattamentoService {
	List <Trattamento> trattamenti();
	Optional<Trattamento> trattamento(Integer id);
	}
