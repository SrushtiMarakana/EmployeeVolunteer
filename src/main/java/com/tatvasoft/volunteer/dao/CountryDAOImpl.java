package com.tatvasoft.volunteer.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.City;
import com.tatvasoft.volunteer.model.Country;
import com.tatvasoft.volunteer.util.HibernateUtil;

@Component
public class CountryDAOImpl implements CountryDAO{

	@Transactional
	@Override
	public List<Country> listOfCountry() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Country c where c.deleted_at = null");
		@SuppressWarnings("unchecked")
		List<Country> country = (List<Country>)q.list();
		s.clear();
		return country;
	}

	@Transactional
	@Override
	public List<City> listOfCity(int country_id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Country  country = (Country)s.get(Country.class,country_id);
		List<City> city = country.getCity();
		t.commit();
		s.clear();
		return city;
	}
	

}
