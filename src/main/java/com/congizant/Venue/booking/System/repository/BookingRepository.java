package com.congizant.Venue.booking.System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.congizant.Venue.booking.System.model.Booking;
import com.congizant.Venue.booking.System.model.User;

public interface BookingRepository extends JpaRepository<Booking, Long> {
 public List<Booking> findByUser(User username);
}
