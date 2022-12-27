package com.tatvasoft.volunteer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.model.Country;
import com.tatvasoft.volunteer.service.CountryService;

@Controller
public class AdminAddMission {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping("/adminAddMission")
	public ModelAndView adminAddMission(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
			List<Country> country = countryService.listOfCountry();
			
			mv.addObject("country",country);
			
	        mv.setViewName("adminAddMission");
			
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
