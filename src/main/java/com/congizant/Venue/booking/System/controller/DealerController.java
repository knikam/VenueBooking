package com.congizant.Venue.booking.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.congizant.Venue.booking.System.model.Dealer;
import com.congizant.Venue.booking.System.service.DealerService;

@RestController
public class DealerController {

	@Autowired
	DealerService service;
	
	@PostMapping("/addDealer")
	public ResponseEntity<Dealer> addDealer(@RequestBody Dealer dealer){
		return service.addDealer(dealer);
	}
	
	@PostMapping("/auth")
	public ResponseEntity<Boolean> login(@RequestParam(name="username") String username, @RequestParam(name="password") String password){
		System.out.print(username+" "+password);
		return service.login(username, password);
	}
}
