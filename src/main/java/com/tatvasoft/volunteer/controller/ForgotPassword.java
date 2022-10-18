package com.tatvasoft.volunteer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForgotPassword {
	
	@RequestMapping("/forgotPassword")
	public ModelAndView forgotPassword(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("forgotPassword");

	}

}
