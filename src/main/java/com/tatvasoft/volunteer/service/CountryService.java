package com.tatvasoft.volunteer.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tatvasoft.volunteer.model.City;
import com.tatvasoft.volunteer.model.Country;

@Service
public interface CountryService {
	
	public List<Country> listOfCountry();
	public List<City> listOfCity(int country_id);
	public Map<Integer, String> getCountriesMap();
	public Map<Integer, String> getCitiesMap(int country_id);

}
