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

import com.tatvasoft.volunteer.model.CMS_Page;
import com.tatvasoft.volunteer.service.CMSPageService;


@Controller
public class AdminEditCMS {
	
	@Autowired
	private CMSPageService cmsPageService;
	
	@RequestMapping(value = "/adminEditCMS/{cmsPageId}", method=RequestMethod.GET)
	public ModelAndView adminEditCMS(HttpServletRequest request, HttpServletResponse response,@PathVariable int cmsPageId) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
			CMS_Page cmsPage = cmsPageService.editCMSPageByAdmin(cmsPageId);
			
			mv.addObject("cmsPage",cmsPage);
			
	        mv.setViewName("adminEditCMS");
			
			return mv;
			
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	@PostMapping("/adminEditCMS/updateCMSByAdmin")
	public ModelAndView updateCMSByAdmin(HttpServletRequest request, HttpServletResponse response) {
		
		int status = 1;
		
		int cmsPageId = Integer.parseInt(request.getParameter("cmsPageId"));
		String title = request.getParameter("title");
		String description = request.getParameter("Description");
		String slug = request.getParameter("slug");
		
		if(!(request.getParameter("status")).isEmpty()) {
			status = Integer.parseInt(request.getParameter("status"));
		}
		
		cmsPageService.updateCMSPageByAdmin(cmsPageId, title, description, slug, status);
		
		return new ModelAndView("redirect:/adminCMS");
		
	}
	
	@RequestMapping(value = "/adminEditCMS/adminCMS")
	public ModelAndView adminCMS(HttpServletRequest request, HttpServletResponse response) {
		
			return new ModelAndView("redirect:/adminCMS");

	}

}
