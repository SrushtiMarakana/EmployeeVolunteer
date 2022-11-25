package com.tatvasoft.volunteer.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.Users;
import com.tatvasoft.volunteer.util.HibernateUtil;

@Component
public class UserDAOImpl implements UserDAO{
	
	@Transactional
	@Override
	public void insertUserDB(Users u) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		s.save(u);
		t.commit();
		s.clear();
	}

	@Override
	public List<Users> isUserExist(String email, String password) {
		Session s = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Users u where u.email='"+email+"' and u.password='"+password+"'");
		@SuppressWarnings("unchecked")
		List<Users> u = (List<Users>)q.list();
		return u;
		
	}


}
