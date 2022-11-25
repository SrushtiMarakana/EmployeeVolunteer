package com.tatvasoft.volunteer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admin {
	
	@RequestMapping("/admin")
	public ModelAndView admin(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("admin");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	

}
