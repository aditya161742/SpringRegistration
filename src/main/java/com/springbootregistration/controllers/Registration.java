package com.springbootregistration.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springbootregistration.services.UserService;

@Controller
public class Registration {
			
		@Autowired
		UserService userService;
	
		/*@RequestMapping(value="/registration",method=RequestMethod.GET )
		public ModelAndView registration(ModelAndView model) {
			
			//model.addAttribute("");	
			model.setViewName("registration");
			return model;
		}*/
		
		@RequestMapping({"/","registration"})
		public ModelAndView registrationView(ModelAndView model) {
			
			model.setViewName("registrationPage");
			return model;
			//System.out.println("hello");
			//return "registrationPage.html";
		}
		
		@RequestMapping(value="/addRegistration",method=RequestMethod.POST )
		public void addRegistration(HttpServletRequest request) {
			
			System.out.println(request.getParameter("username"));
			System.out.println(request.getParameter("email"));
			System.out.println(request.getParameter("password"));
			//userService.addRegistration(request.getParameter("username"), request.getParameter("email"), request.getParameter("password"));
			
			//model.addAttribute("");
			//sreturn "registration";
		}
		
}
