package com.ams.hotel.service.interfacce;

import com.ams.hotel.Model.Soggiorno;

public interface ISoggiornoService {
	Soggiorno add(Soggiorno s);
	void remove(Integer i);
	Soggiorno sogg(Integer i);
}
