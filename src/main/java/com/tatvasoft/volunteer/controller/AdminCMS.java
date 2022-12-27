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

import com.tatvasoft.volunteer.model.CMS_Page;
import com.tatvasoft.volunteer.service.CMSPageService;

@Controller
public class AdminCMS {
	
	@Autowired
	private CMSPageService cmsPageService;

	@RequestMapping("/adminCMS")
	public ModelAndView adminCMS(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
			List<CMS_Page> cmsPage = cmsPageService.cmsPageListing();
			
			mv.addObject("cmsPage",cmsPage);
			
	        mv.setViewName("adminCMS");
			
			return mv;
			
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	@PostMapping("/deleteCMSByAdmin")
	public ModelAndView deleteCMSByAdmin(HttpServletRequest request, HttpServletResponse response) {
		
		int cmsPageId = Integer.parseInt(request.getParameter("cmsPageId"));
		
		cmsPageService.deleteCMSByAdmin(cmsPageId);
		
		return new ModelAndView("redirect:/adminCMS");
		
	}
}
