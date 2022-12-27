package com.tatvasoft.volunteer.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.model.Users;

@Service
public interface UserService {
	
	public void insertUser(String fname, String lname, String email, Long phoneno, String password);
	public ModelAndView isUserValid(HttpServletRequest request);
	public ModelAndView forFP(String email);
	public void resetPassword(int userid, String password);
	public void insertUserByAdmin(String fname, String lname, String email, String password, String avatar, String employee_id, String department,int  city, int  country,String profile_text, int status);
	public List<Users> userListing();
	public Users editUserByAdmin(int userid);
	public void updateUserByAdmin(int userid, String fname, String lname, String email, String password, String avatar, String employee_id, String department,int  city, int  country,String profile_text, int status);
	public void deleteUserByAdmin(int userid);
	
}
