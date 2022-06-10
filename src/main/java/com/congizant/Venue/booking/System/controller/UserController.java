package com.congizant.Venue.booking.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.congizant.Venue.booking.System.model.User;
import com.congizant.Venue.booking.System.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return service.addUser(user);
	}
	
	@GetMapping("/getUserById")
	public ResponseEntity<User> getUserById(@RequestParam(name="id") String id){
		return service.getUserById(id);
	}
}
