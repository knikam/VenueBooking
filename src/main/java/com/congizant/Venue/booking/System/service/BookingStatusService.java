package com.congizant.Venue.booking.System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.congizant.Venue.booking.System.model.BookingStatus;
import com.congizant.Venue.booking.System.repository.BookingStatusRepository;

@Service
public class BookingStatusService {

	@Autowired
	private BookingStatusRepository repository;
	
	public ResponseEntity<BookingStatus> addBooking(BookingStatus booking){
		BookingStatus resBooking = repository.save(booking);
		
		if(resBooking != null) {
			return new ResponseEntity<BookingStatus>(resBooking,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(resBooking,HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<BookingStatus> getBookingStatus(long id){
		BookingStatus booking = repository.findById(id).orElse(null);
		
		if(booking != null) {
			return new ResponseEntity<BookingStatus>(booking,HttpStatus.OK);
		}else {
			return new ResponseEntity<BookingStatus>(booking,HttpStatus.NOT_FOUND);
		}
	}
}
