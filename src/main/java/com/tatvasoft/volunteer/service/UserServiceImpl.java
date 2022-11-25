package com.tatvasoft.volunteer.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.tatvasoft.volunteer.dao.UserDAO;
import com.tatvasoft.volunteer.dao.AdminDAO;
import com.tatvasoft.volunteer.model.Admins;
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
	
	
	@Override
	public ModelAndView isUserValid(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		List<Users> u = userDAO.isUserExist(email, password);
		
		List<Admins> a = adminDAO.isAdminExist(email, password);
		
        if(!u.isEmpty()) {
          for(Users user : u){
              int userid = user.getUser_id();
              String fname= user.getFirst_name();
              HttpSession session = request.getSession();
              session.setAttribute("authenticated", true);
              session.setAttribute("userid", userid);
              session.setAttribute("firstname", fname);
              mv.setViewName("redirect:/homePage");
          }
        }
        else if(!a.isEmpty()) {
        	for(Admins admin : a){
                int userid = admin.getAdmin_id();
                String fname= admin.getFirst_name();
                HttpSession session = request.getSession();
                session.setAttribute("authenticated", true);
                session.setAttribute("userid", userid);
                session.setAttribute("firstname", fname);
                mv.setViewName("redirect:/admin");
            }	
        }
        else {
        	mv.setViewName("redirect:/index");
        }
		
		return mv;
		
	}

}
