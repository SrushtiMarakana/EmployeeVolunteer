package com.tatvasoft.volunteer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.service.MissionThemeService;


@Controller
public class AdminAddMissionTheme {
	
	@Autowired
	private MissionThemeService missionThemeService;
	
	@RequestMapping("/adminAddMissionTheme")
	public ModelAndView adminAddMissionTheme(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
	        mv.setViewName("adminAddMissionTheme");
			
			return mv;
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	@PostMapping("/addMissionTheme")
	public ModelAndView addMissionTheme(HttpServletRequest request, HttpServletResponse response) {
	
		int status = 1;
		
		String title = request.getParameter("title");
		
		if(!(request.getParameter("status")).isEmpty()) {
			status = Integer.parseInt(request.getParameter("status"));
		}
		
		missionThemeService.insertMissionThemeByAdmin(title, status);
		
		return new ModelAndView("redirect:/adminMissionTheme");
		
	}



}
