package com.tatvasoft.volunteer.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.NoResultException;
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

	@Transactional
	@Override
	public Users isUserExist(String email, String password) {
		Session s = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Users u where u.email='"+email+"' and u.password='"+password+"' and u.deleted_at = null");
        Users user = null;
        try {
        	user = (Users) q.getSingleResult();
		}catch(NoResultException nre) {
			
		}
		s.clear();
		return user;
	}

	@Transactional
	@Override
	public Users getIdForFP(String email) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Users u where u.email='"+email+"' and u.deleted_at = null");
		Users user = null;
        try {
        	user = (Users) q.getSingleResult();
		}catch(NoResultException nre) {
			
		}
		s.clear();
		return user;
	}

	@Transactional
	@Override
	public void resetPassword(int userid, String password) {
		Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Users  u = (Users)s.get(Users.class,userid);
        u.setPassword(password);
        s.saveOrUpdate(u);
        t.commit();
        s.clear();
	}
	
	
	@Transactional
	@Override
	public void insertUserByAdminDB(Users u) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		s.save(u);
		t.commit();
		s.clear();
	}

	@Transactional
	@Override
	public List<Users> userListing() {
		Session s = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Users users where users.deleted_at = null");
        @SuppressWarnings("unchecked")
		List<Users> u = (List<Users>)q.list();
		return u;
	}

	@Transactional
	@Override
	public Users editUserByAdmin(int userid) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Users  users = (Users)s.get(Users.class,userid);
		return users;
	}

	@Transactional
	@Override
	public void updateUserByAdminDB(int userid, Users u) {
		Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Users  users = (Users)s.get(Users.class,userid);
        users.setFirst_name(u.getFirst_name());
        users.setLast_name(u.getLast_name());
        users.setEmail(u.getEmail());
        users.setPassword(u.getPassword());
        users.setAvatar(u.getAvatar());
        users.setEmployee_id(u.getEmployee_id());
        users.setDepartment(u.getDepartment());
        users.setCountry(u.getCountry());
        users.setCity(u.getCity());
        users.setProfile_text(u.getProfile_text());
        users.setStatus(u.getStatus());
        users.setUpdated_at(LocalDateTime.now());
        s.saveOrUpdate(users);
        t.commit();
		
	}
	
	@Transactional
	@Override
	public void deleteUserByAdmin(int userid) {

		Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Users  users = (Users)s.get(Users.class,userid);
        users.setDeleted_at(LocalDateTime.now());
        s.saveOrUpdate(users);
        t.commit();
		
	}


}
