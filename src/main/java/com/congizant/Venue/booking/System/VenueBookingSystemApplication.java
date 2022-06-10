package com.congizant.Venue.booking.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class VenueBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenueBookingSystemApplication.class, args);
	}

}
