package com.congizant.Venue.booking.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.congizant.Venue.booking.System.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long>{

}
