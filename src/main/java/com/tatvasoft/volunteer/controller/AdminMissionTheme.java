package com.tatvasoft.volunteer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.model.Mission_Theme;
import com.tatvasoft.volunteer.service.MissionThemeService;

@Controller
public class AdminMissionTheme {
	
	@Autowired
	private MissionThemeService missionThemeService;
	
	@RequestMapping("/adminMissionTheme")
	public ModelAndView adminMissionTheme(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
			List<Mission_Theme> missionTheme = missionThemeService.missionThemeListing();
			
			mv.addObject("missionTheme",missionTheme);
			
	        mv.setViewName("adminMissionTheme");
			
			return mv;
			
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}

}
