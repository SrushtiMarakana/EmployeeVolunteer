package com.tatvasoft.volunteer.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.dao.AdminDAO;
import com.tatvasoft.volunteer.dao.UserDAO;
import com.tatvasoft.volunteer.model.Admins;
import com.tatvasoft.volunteer.model.City;
import com.tatvasoft.volunteer.model.Country;
import com.tatvasoft.volunteer.model.Users;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private AdminDAO adminDAO;
	
	@Transactional
	@Override
	public void insertUser(String fname, String lname, String email, Long phoneno, String password) {
		Users u = new Users(fname,lname,email,phoneno,password);
		userDAO.insertUserDB(u);
	}
	
	@Transactional
	@Override
	public ModelAndView isUserValid(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Users user = userDAO.isUserExist(email, password);
		
		Admins admin = adminDAO.isAdminExist(email, password);
		
		 if(admin != null) {
	                int userid = admin.getAdmin_id();
	                String fname= admin.getFirst_name();
	                HttpSession session = request.getSession();
	                session.setAttribute("authenticated", true);
	                session.setAttribute("adminauthenticated", true);
	                session.setAttribute("userid", userid);
	                session.setAttribute("firstname", fname);
	                mv.setViewName("redirect:/adminUser");
	    }
		 
		else if(user != null) {
              int userid = user.getUser_id();
              String fname= user.getFirst_name();
              HttpSession session = request.getSession();
              session.setAttribute("authenticated", true);
              session.setAttribute("userid", userid);
              session.setAttribute("firstname", fname);
              mv.setViewName("redirect:/homePage");
        }
        else {
        	mv.setViewName("redirect:/index?emsg=Invalid Email Address or Password.");
        }
		
		return mv;
		
	}

	@Transactional
	@Override
	public ModelAndView forFP(String email) {
		
		ModelAndView mv = new ModelAndView();
		
		Users user = userDAO.getIdForFP(email);
		
		if(user != null) {
	              int userid = user.getUser_id();
	              mv.addObject("userid", userid);
	              mv.setViewName("resetPassword");
		}
		else {
			mv.setViewName("redirect:/forgotPassword?emsg=This email is not exist please try another email.");
		}
	
		return mv;
	}

	@Transactional
	@Override
	public void resetPassword(int userid, String password) {
		userDAO.resetPassword(userid, password);
	}

	@Transactional
	@Override
	public void insertUserByAdmin(String fname, String lname, String email, String password, String avatar,
			String employee_id, String department, int cityId, int countryId, String profile_text, int s) {
		
		 Country country = new Country();
		 country.setCountry_id(countryId);
		 
		 City city = new City();
		 city.setCity_id(cityId);
		 
		 boolean status = true;
		 
		 if(s == 0) {
			 status = false;
		 }
		 
		 Users u = new Users(fname, lname, email, password, avatar, employee_id,
					department, city, country, profile_text, status);
		 
		 userDAO.insertUserByAdminDB(u);
		
	}

	@Transactional
	@Override
	public List<Users> userListing() {
		
		List<Users> u = userDAO.userListing();
		return u;
		
	}

	@Transactional
	@Override
	public Users editUserByAdmin(int userid) {
		
		Users u = userDAO.editUserByAdmin(userid);
		return u;
		
	}

	@Transactional
	@Override
	public void updateUserByAdmin(int userid, String fname, String lname, String email, String password, String avatar,
			String employee_id, String department, int cityId, int countryId, String profile_text, int status) {
		
		 Country country1 = new Country();
		 country1.setCountry_id(countryId);
		 
		 City city1 = new City();
		 city1.setCity_id(cityId);
		 
		 boolean status1 = true;
		 
		 if(status == 0) {
			 status1 = false;
		 }
		 
		 Users u = new Users(fname, lname, email, password, avatar, employee_id,
					department, city1, country1, profile_text, status1);
		 
		 userDAO.updateUserByAdminDB(userid, u);
		
	}

	@Transactional
	@Override
	public void deleteUserByAdmin(int userid) {
		
		userDAO.deleteUserByAdmin(userid);
		
	}

}
