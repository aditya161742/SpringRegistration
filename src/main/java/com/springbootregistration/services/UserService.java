package com.springbootregistration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootregistration.Repositories.interf.UserDetailsInterf;
import com.springbootregistration.models.Users;

@Service
public class UserService {
	
	@Autowired
	UserDetailsInterf userDetailsRepo;
	
	Users users;
	
	public boolean addRegistration(String email,String username,String password) {
		
		users.setEmail(email);
		users.setUsername(username);
		users.setPassword(password);
		
		userDetailsRepo.save(users);
		return true;
	}
	
}
