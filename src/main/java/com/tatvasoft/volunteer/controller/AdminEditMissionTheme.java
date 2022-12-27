package com.tatvasoft.volunteer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.model.Mission_Theme;
import com.tatvasoft.volunteer.service.MissionThemeService;

@Controller
public class AdminEditMissionTheme {
	
	@Autowired
	private MissionThemeService missionThemeService;
	
	@RequestMapping(value = "/adminEditMissionTheme/{themeId}", method=RequestMethod.GET)
	public ModelAndView adminEditMissionTheme(HttpServletRequest request, HttpServletResponse response,@PathVariable int themeId) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
			Mission_Theme missionTheme = missionThemeService.editMissionThemeByAdmin(themeId);
			
			mv.addObject("missionTheme",missionTheme);
			
	        mv.setViewName("adminEditMissionTheme");
			
			return mv;
			
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	@PostMapping("/adminEditMissionTheme/updateMissionThemeByAdmin")
	public ModelAndView updateMissionThemeByAdmin(HttpServletRequest request, HttpServletResponse response) {
		
		int status = 1;
		
		int missionThemeId = Integer.parseInt(request.getParameter("MissionThemeId"));
		String title = request.getParameter("title");
		
		if(!(request.getParameter("status")).isEmpty()) {
			status = Integer.parseInt(request.getParameter("status"));
		}
		
		missionThemeService.updateMissionThemeByAdmin(missionThemeId, title, status);
		
		return new ModelAndView("redirect:/adminMissionTheme");
		
	}
	
	@RequestMapping(value = "/adminEditMissionTheme/adminMissionTheme")
	public ModelAndView adminMissionTheme(HttpServletRequest request, HttpServletResponse response) {
		
			return new ModelAndView("redirect:/adminMissionTheme");

	}

}
