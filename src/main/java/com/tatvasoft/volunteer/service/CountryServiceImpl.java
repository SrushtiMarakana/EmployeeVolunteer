package com.tatvasoft.volunteer.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatvasoft.volunteer.dao.CountryDAO;
import com.tatvasoft.volunteer.model.City;
import com.tatvasoft.volunteer.model.Country;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryDAO countryDAO;

	@Transactional
	@Override
	public List<Country> listOfCountry() {
		
		return countryDAO.listOfCountry();
		
	}

	@Transactional
	@Override
	public List<City> listOfCity(int country_id) {
		
		return countryDAO.listOfCity(country_id);
	}
	

	@Transactional
	@Override
	public Map<Integer, String> getCountriesMap() {
		
		Map<Integer, String> countryMap = new HashMap<>();
		
		List<Country> country = countryDAO.listOfCountry();
		
		if(!country.isEmpty()){
		
			for(Country c : country) {
			
				countryMap.put(c.getCountry_id(), c.getName());
			
			}
		}
		
		return countryMap;
	}


	@Transactional
	@Override
	public Map<Integer, String> getCitiesMap(int country_id) {
		
		Map<Integer, String> citiesMap = new HashMap<>();
		
		List<City> city = countryDAO.listOfCity(country_id);
		
		if(!city.isEmpty()){
		
			for(City c : city) {
			
				citiesMap.put(c.getCity_id(), c.getName());
			
			}
		}
		
		return citiesMap;

	}
}
