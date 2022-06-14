package com.congizant.Venue.booking.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.congizant.Venue.booking.System.model.Booking;
import com.congizant.Venue.booking.System.model.User;
import com.congizant.Venue.booking.System.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository repository;
	
	@Autowired 
	EmailService emailService;
	
	public ResponseEntity<Booking> addBooking(Booking booking){
		List<Booking> resBook = repository.findAll();
		boolean flag= false;
	
		for (Booking b : resBook) {
			System.out.println(b.toString());
			if(booking.getVenueType().equals(b.getVenueType()) && booking.getDate().equals(b.getDate()) && booking.getVenue().getId()==b.getVenue().getId()) {
				flag = true;
			}
		}
		
		if(flag) {
			return new ResponseEntity<Booking>(new Booking(),HttpStatus.CONFLICT);
		}
		
		Booking resBooking = repository.save(booking);
		
		emailService.sendSimpleMessage(resBooking.getVenue().getDealer().getEmail(),
				"Booking "+resBooking.getVenueType(),
				" Hi "+resBooking.getVenue().getDealer().getName()+","+" Our User "+resBooking.getUser().getName()+" booked your "+resBooking.getVenueType()+" for date "+resBooking.getDate()+" Thank you");
		if(resBooking != null) {	
			return new ResponseEntity<Booking>(resBooking,HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Booking>(resBooking,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public ResponseEntity<List<Booking>> getBookingByUser(User user) {
		List<Booking> list = repository.findByUser(user);
		if(list.size() > 0) {
			return new ResponseEntity<List<Booking>>(list,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Booking>>(list, HttpStatus.NOT_FOUND);
		}
	}
	
}
