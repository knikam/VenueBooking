package com.congizant.Venue.booking.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.congizant.Venue.booking.System.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}
