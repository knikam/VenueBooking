package com.congizant.Venue.booking.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.congizant.Venue.booking.System.model.Booking;
import com.congizant.Venue.booking.System.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService service;
	
	@PostMapping("/addBooking")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
		return service.addBooking(booking);
	}
}
