package com.tatvasoft.volunteer.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.tatvasoft.volunteer.service.CountryService;

@Controller
public class CityServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping("/CityServlet")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int countryId = Integer.parseInt(request.getParameter("countryId"));
		
		Map<Integer, String> cityMap = countryService.getCitiesMap(countryId);
		Gson json = new Gson();
		
		String cityString  = json.toJson(cityMap);
		response.setContentType("text/html");
		response.getWriter().write(cityString);
		
	}

}
