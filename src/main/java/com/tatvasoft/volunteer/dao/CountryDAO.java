package com.tatvasoft.volunteer.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.City;
import com.tatvasoft.volunteer.model.Country;

@Component
public interface CountryDAO {
	
	public List<Country> listOfCountry();
	public List<City> listOfCity(int country_id);

}
