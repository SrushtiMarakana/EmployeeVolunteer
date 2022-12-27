package com.tatvasoft.volunteer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatvasoft.volunteer.dao.CityDAO;
import com.tatvasoft.volunteer.model.City;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityDAO cityDAO;

	@Transactional
	@Override
	public List<City> listOfCity() {
		
		return cityDAO.listOfCity();
		
	}

}
