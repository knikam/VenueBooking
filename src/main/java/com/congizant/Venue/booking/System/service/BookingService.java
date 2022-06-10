package com.congizant.Venue.booking.System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.congizant.Venue.booking.System.model.Booking;
import com.congizant.Venue.booking.System.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository repository;
	
	public ResponseEntity<Booking> addBooking(Booking booking){
		Booking resBooking = repository.save(booking);

		if(resBooking != null) {	
			return new ResponseEntity<Booking>(resBooking,HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Booking>(resBooking,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
