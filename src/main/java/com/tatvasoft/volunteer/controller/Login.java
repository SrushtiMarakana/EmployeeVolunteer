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
public class Login {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("redirect:/index");

	}
	
	@RequestMapping("/index")
	public ModelAndView index1(HttpServletRequest request, HttpServletResponse response) {
		
		if((request.getParameter("emsg")!= null) || (request.getParameter("smsg")!= null)) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("emsg",request.getParameter("emsg"));
			mv.addObject("smsg",request.getParameter("smsg"));
			mv.setViewName("login");
			return mv;
		}
		return new ModelAndView("login");

	}
	
	@PostMapping("/login")
	public ModelAndView loginUser(HttpServletRequest request, HttpServletResponse response) {
		
		return userService.isUserValid(request);
		
	}

}
