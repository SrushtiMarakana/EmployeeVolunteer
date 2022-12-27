package com.tatvasoft.volunteer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.model.Users;
import com.tatvasoft.volunteer.service.UserService;

@Controller
public class AdminUser {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/adminUser")
	public ModelAndView adminUser(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
			List<Users> users = userService.userListing();
			
			mv.addObject("users",users);
	        mv.setViewName("adminUser");
			
			return mv;
			
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	@PostMapping("/deleteUserByAdmin")
	public ModelAndView deleteUserByAdmin(HttpServletRequest request, HttpServletResponse response) {
		
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		userService.deleteUserByAdmin(userId);
		
		return new ModelAndView("redirect:/adminUser");
		
	}

	
	

}
