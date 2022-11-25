package com.tatvasoft.volunteer.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.Admins;
import com.tatvasoft.volunteer.util.HibernateUtil;

@Component
public class AdminDAOImpl implements AdminDAO{

	@Override
	public List<Admins> isAdminExist(String email, String password) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Admins a where a.email='"+email+"' and a.password='"+password+"'");
		@SuppressWarnings("unchecked")
		List<Admins> a = (List<Admins>)q.list();
		s.clear();
		return a;
	}

}
