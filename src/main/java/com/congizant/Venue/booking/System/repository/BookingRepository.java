package com.congizant.Venue.booking.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.congizant.Venue.booking.System.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
