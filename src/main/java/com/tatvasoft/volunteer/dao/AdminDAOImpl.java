package com.tatvasoft.volunteer.dao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.Admins;
import com.tatvasoft.volunteer.util.HibernateUtil;

@Component
public class AdminDAOImpl implements AdminDAO{

	@Transactional
	@Override
	public Admins isAdminExist(String email, String password) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Admins a where a.email='"+email+"' and a.password='"+password+"' and a.deleted_at = null");
		Admins admin = null;
		try {
			admin = (Admins) q.getSingleResult();
		}catch(NoResultException nre) {
			
		}
		s.clear();
		return admin;
	}

}
