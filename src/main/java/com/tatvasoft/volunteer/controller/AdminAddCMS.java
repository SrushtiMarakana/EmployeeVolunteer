package com.tatvasoft.volunteer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.service.CMSPageService;

@Controller
public class AdminAddCMS {
	
	@Autowired
	private CMSPageService cmsPageService;
	
	@RequestMapping("/adminAddCMS")
	public ModelAndView adminAddCMS(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
	        mv.setViewName("adminAddCMS");
			
			return mv;
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	@PostMapping("/addCMS")
	public ModelAndView addCMS(HttpServletRequest request, HttpServletResponse response) {
	
		int status = 1;
		
		String title = request.getParameter("title");
		String description = request.getParameter("Description");
		String slug = request.getParameter("slug");
		
		if(!(request.getParameter("status")).isEmpty()) {
			status = Integer.parseInt(request.getParameter("status"));
		}
		
		cmsPageService.insertCMSByAdmin(title, description, slug, status);
		
		return new ModelAndView("redirect:/adminCMS");
		
	}

}
