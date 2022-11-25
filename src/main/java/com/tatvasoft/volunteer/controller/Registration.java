package com.tatvasoft.volunteer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.service.UserService;

@Controller
public class Registration {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/registration")
	public ModelAndView registration(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("registration");

	}
	
	@PostMapping("/RegisterUser")
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response) {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		Long phoneno = Long.parseLong(request.getParameter("phoneno"));
		String password = request.getParameter("password");

	    userService.insertUser(fname, lname, email, phoneno, password);
		return new ModelAndView("redirect:/index");
	}

}
