package com.tatvasoft.volunteer.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.model.Country;
import com.tatvasoft.volunteer.model.Users;
import com.tatvasoft.volunteer.service.CountryService;
import com.tatvasoft.volunteer.service.UserService;

@Controller
public class AdminEditUser {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value = "/adminEditUser/{userid}", method=RequestMethod.GET)
	public ModelAndView adminEditUser(HttpServletRequest request, HttpServletResponse response,@PathVariable int userid) {

		HttpSession session = request.getSession(false);
		if((session.getAttribute("adminauthenticated")) != null ) {
			
			ModelAndView mv = new ModelAndView();
			
			Users users = userService.editUserByAdmin(userid);
			
			List<Country> country = countryService.listOfCountry();
			
			mv.addObject("country",country);
			
			mv.addObject("users",users);
			
	        mv.setViewName("adminEditUser");
			
			return mv;
			
		}
		else if((session.getAttribute("authenticated")) != null ) {
			return new ModelAndView("redirect:/homePage");
		}
		else {
			return new ModelAndView("redirect:/index");
		}

	}
	
	@PostMapping("/adminEditUser/updateUserByAdmin")
	public ModelAndView updateUserByAdmin(HttpServletRequest request, HttpServletResponse response, @RequestParam("avatar") CommonsMultipartFile file, HttpSession s) {
		
		String avatar = null;
		int status = 1;
		
		if(!file.isEmpty()) {
			
			String path = s.getServletContext().getRealPath("/WEB-INF/Images/Avatar/");
			avatar = file.getOriginalFilename();
		
			try {
				byte barr[] = file.getBytes();
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path + "/" + avatar));
				bout.write(barr);
				bout.flush();
				bout.close();
			
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		int userId = Integer.parseInt(request.getParameter("userId"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String employeeId = request.getParameter("EmployeeID");
		String department = request.getParameter("Department");
		int countryId = Integer.parseInt(request.getParameter("Country"));
		int cityId = Integer.parseInt(request.getParameter("City"));
		String profileText = request.getParameter("ProfileText");
		if(!(request.getParameter("status")).isEmpty()) {
			status = Integer.parseInt(request.getParameter("status"));
		}
		
		
		userService.updateUserByAdmin(userId, fname, lname, email, password, avatar, employeeId, department, cityId, countryId, profileText, status);
		
		return new ModelAndView("redirect:/adminUser");
		
	}
	
	@RequestMapping(value = "/adminEditUser/adminUser")
	public ModelAndView adminUser(HttpServletRequest request, HttpServletResponse response) {
		
			return new ModelAndView("redirect:/adminUser");

	}

}
