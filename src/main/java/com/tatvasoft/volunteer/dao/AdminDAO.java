package com.tatvasoft.volunteer.dao;

import java.util.List;

import com.tatvasoft.volunteer.model.Admins;

public interface AdminDAO {
	
	public List<Admins> isAdminExist(String email,String password);

}
