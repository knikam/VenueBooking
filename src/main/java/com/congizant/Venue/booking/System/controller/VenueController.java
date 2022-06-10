package com.congizant.Venue.booking.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.congizant.Venue.booking.System.model.Venue;
import com.congizant.Venue.booking.System.service.VenueService;

@RestController
public class VenueController {

	@Autowired
	VenueService service;
	
	@PostMapping("/addVenue")
	public ResponseEntity<Venue> addVenue(@RequestBody Venue venue){
		return service.addVanue(venue);
	}
	
	@GetMapping("/getVenue")
	public ResponseEntity<List<Venue>> getVenues(){
		return service.getVenues();
	}
}
