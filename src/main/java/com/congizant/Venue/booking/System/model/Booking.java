package com.congizant.Venue.booking.System.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="date")
	private String date;
	
	@Column(name="venueType")
	private String venueType;
	
	@ManyToOne
	User user;
	
	@ManyToOne
	Venue venue;
	
	

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Booking(long id, String date, String venueType, User user, Venue venue) {
		super();
		this.id = id;
		this.date = date;
		this.venueType = venueType;
		this.user = user;
		this.venue = venue;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public String getVenueType() {
		return venueType;
	}

	public void setVenueType(String venueType) {
		this.venueType = venueType;
	}

	
	
}
