package com.tatvasoft.volunteer.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.City;
import com.tatvasoft.volunteer.util.HibernateUtil;

@Component
public class CityDAOImpl implements CityDAO{

	@Transactional
	@Override
	public List<City> listOfCity() {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("rawtypes")
		Query q = s.createQuery("from City city where city.deleted_at = null");
		@SuppressWarnings("unchecked")
		List<City> city = (List<City>)q.list();
		s.clear();
		return city;
	}

}
