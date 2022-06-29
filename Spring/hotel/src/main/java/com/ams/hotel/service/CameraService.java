package com.ams.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.hotel.Model.Camera;

import com.ams.hotel.repository.CameraRepository;
import com.ams.hotel.service.interfacce.ICameraService;

@Service
public class CameraService implements ICameraService{
	@Autowired
	CameraRepository cRepository;

	@Override
	public Camera add(Camera c) {
		return cRepository.save(c);
	}

	@Override
	public List<Camera> all() {
		return (List<Camera>)cRepository.findAll();
	}

	
}
