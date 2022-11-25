package com.tatvasoft.volunteer.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public interface UserService {
	
	public void insertUser(String fname, String lname, String email, Long phoneno, String password);
	public ModelAndView isUserValid(HttpServletRequest request);

}
