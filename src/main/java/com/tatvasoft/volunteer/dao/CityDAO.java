package com.tatvasoft.volunteer.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.City;

@Component
public interface CityDAO {
	
	public List<City> listOfCity();

}
