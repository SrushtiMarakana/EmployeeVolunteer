package com.tatvasoft.volunteer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoriesListing {
	
	@RequestMapping("/storiesListing")
	public ModelAndView storiesListing(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("storiesListing");

	}

}
