package com.ams.hotel.service.interfacce;

import java.util.Optional;

import com.ams.hotel.Model.Stato;

public interface IStatoService {
	Optional<Stato> stato(Integer i);
}
