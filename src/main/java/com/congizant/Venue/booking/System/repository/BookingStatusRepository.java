package com.congizant.Venue.booking.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.congizant.Venue.booking.System.model.BookingStatus;

public interface BookingStatusRepository extends JpaRepository<BookingStatus, Long> {

}
