package com.ams.hotel.service.interfacce;

import java.util.List;

import com.ams.hotel.Model.Utente;

public interface IUtenteService {
	Utente add(Utente u);
	List<Utente> all();
}
