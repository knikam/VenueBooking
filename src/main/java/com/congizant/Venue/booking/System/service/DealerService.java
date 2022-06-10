package com.congizant.Venue.booking.System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.congizant.Venue.booking.System.model.Dealer;
import com.congizant.Venue.booking.System.repository.DealerRepository;

@Service
public class DealerService {

	@Autowired
	DealerRepository repository;
	
	public ResponseEntity<Dealer> addDealer(Dealer dealer){
		Dealer resDealer = repository.save(dealer);
		
		if(resDealer != null)
			return new ResponseEntity<Dealer>(resDealer,HttpStatus.CREATED);
		return new ResponseEntity<Dealer>(resDealer, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	public ResponseEntity<Boolean> login(String username, String password){
		Dealer dealer = repository.findById(username).orElse(null);
		if(dealer != null && dealer.getPassword().equals(password))
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		return new ResponseEntity<Boolean>(false,HttpStatus.NOT_FOUND);
	}
}
