package com.congizant.Venue.booking.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.congizant.Venue.booking.System.model.BookingStatus;
import com.congizant.Venue.booking.System.service.BookingStatusService;

@RestController
@CrossOrigin("*")
public class BookingStatusController {

	@Autowired
	private BookingStatusService service;
	
	@PostMapping("/addBookingStatus")
	public ResponseEntity<BookingStatus> addBookingStatus(@RequestBody BookingStatus booking){
		return service.addBooking(booking);
	}
	
	@GetMapping("/getBookingStatusById")
	public ResponseEntity<BookingStatus> getBookingStatusById(@RequestParam(name="id") long id){
		return service.getBookingStatus(id);
	}
}
