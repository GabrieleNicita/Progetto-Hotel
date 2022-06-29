package com.ams.hotel.service.interfacce;

import java.util.List;


import com.ams.hotel.Model.Camera;

public interface ICameraService {
	Camera add(Camera c);
	List<Camera> all();
}
