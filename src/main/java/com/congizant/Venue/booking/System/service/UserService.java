package com.congizant.Venue.booking.System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.congizant.Venue.booking.System.model.User;
import com.congizant.Venue.booking.System.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	public ResponseEntity<User> addUser(User user){
		user.setPassword(getEncodedPassword(user.getPassword()));
		User resUser = repository.save(user);
		
		if(resUser != null) {
			return new ResponseEntity<User>(user,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<User>(user,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<User> getUserById(String id){
		User user = repository.findById(id).orElse(null);
		
		if(user != null)
			return new ResponseEntity<User>(user,HttpStatus.OK);
		else
			return new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
	}
	
	public String getEncodedPassword(String password) {
		return passwordEncoder.encode(password);
	}
}
