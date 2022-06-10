package com.congizant.Venue.booking.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.congizant.Venue.booking.System.model.Venue;
import com.congizant.Venue.booking.System.repository.VenueRepository;

@Service
public class VenueService {

	@Autowired
	VenueRepository repository;
	
	public ResponseEntity<Venue> addVanue(Venue venue){
		Venue resVenue= repository.save(venue);
		
		if(venue != null)
			return new ResponseEntity<Venue>(resVenue,HttpStatus.CREATED);
		return new ResponseEntity<Venue>(resVenue,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	public ResponseEntity<List<Venue>> getVenues(){
		List<Venue> venues = repository.findAll();
		if(venues.size()>0)
			return ResponseEntity.ok(venues);
		return new ResponseEntity<List<Venue>>(venues,HttpStatus.NOT_FOUND);
	}
}
