package com.congizant.Venue.booking.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.congizant.Venue.booking.System.model.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, String> {
	public Dealer findByLoginIdAndPassword(String loginId,String password);
}
