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
public class ForgotPassword {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/forgotPassword")
	public ModelAndView forgotPassword(HttpServletRequest request, HttpServletResponse response) {
		
		
		if(request.getParameter("emsg")!= null) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("emsg",request.getParameter("emsg"));
			mv.setViewName("forgotPassword");
			return mv;
		}
		return new ModelAndView("forgotPassword");

	}
	
	@PostMapping("/fpemail")
	public ModelAndView fpemail(HttpServletRequest request, HttpServletResponse response) {
		
		String email = request.getParameter("email");
		
		return userService.forFP(email);

	}

}
