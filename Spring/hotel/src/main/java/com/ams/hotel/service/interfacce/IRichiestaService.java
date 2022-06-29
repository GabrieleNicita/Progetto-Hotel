package com.ams.hotel.service.interfacce;

import java.util.List;

import com.ams.hotel.Model.Richiesta;

public interface IRichiestaService {
	Richiesta add(Richiesta r);
	List<Richiesta> all();
}