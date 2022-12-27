package com.tatvasoft.volunteer.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.Users;

@Component
public interface UserDAO {
	
	public void insertUserDB(Users u);
	public Users isUserExist(String email,String password);
	public Users getIdForFP(String email);
	public void resetPassword(int userid, String password);
	public void insertUserByAdminDB(Users u);
	public List<Users> userListing();
	public Users editUserByAdmin(int userid);
	public void updateUserByAdminDB(int userid,Users u);
	public void deleteUserByAdmin(int userid);
	
}
