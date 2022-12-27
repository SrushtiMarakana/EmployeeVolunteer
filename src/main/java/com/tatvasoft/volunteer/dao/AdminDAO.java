package com.tatvasoft.volunteer.dao;

import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.Admins;

@Component
public interface AdminDAO {
	
	public Admins isAdminExist(String email,String password);

}
