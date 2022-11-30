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
public class ResetPassword {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/resetPassword")
	public ModelAndView resetPassword(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("forgotPassword");

	}
	
	@RequestMapping("/resetNewPassword")
	public ModelAndView resetNewPassword(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("resetPassword");

	}
	
	@PostMapping("/rpassword")
	public ModelAndView rpassword(HttpServletRequest request, HttpServletResponse response) {
		
		int userid = Integer.parseInt(request.getParameter("userid"));
		String password = request.getParameter("password");
		
		userService.resetPassword(userid, password);
		
		return new ModelAndView("redirect:/index?smsg=Password Reset Successfully");
		
	}
}
