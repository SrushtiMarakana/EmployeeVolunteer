package com.tatvasoft.volunteer.dao;

import java.util.List;

import com.tatvasoft.volunteer.model.Users;

public interface UserDAO {
	
	public void insertUserDB(Users u);
	public List<Users> isUserExist(String email,String password);
	public List<Users> getIdForFP(String email);
	public void resetPassword(int userid, String password);

}
