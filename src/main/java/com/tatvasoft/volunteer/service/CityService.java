package com.tatvasoft.volunteer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tatvasoft.volunteer.model.City;

@Service
public interface CityService {
	
	public List<City> listOfCity();

}
