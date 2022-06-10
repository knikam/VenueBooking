package com.congizant.Venue.booking.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.congizant.Venue.booking.System.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
