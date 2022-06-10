package com.congizant.Venue.booking.System.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Venue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	 
	@Column(name="hall")
	private boolean hall;
	
	@Column(name="auditorium")
	private boolean auditorium;
	
	@Column(name="hotel")
	private boolean hotel;
	
	@Column(name="restaurants")
	private boolean restaurants;
	
	@ManyToOne
	private Dealer dealer;

	public Venue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venue(long id, boolean hall, boolean auditorium, boolean hotel, boolean restaurants, Dealer dealer) {
		super();
		this.id = id;
		this.hall = hall;
		this.auditorium = auditorium;
		this.hotel = hotel;
		this.restaurants = restaurants;
		this.dealer = dealer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isHall() {
		return hall;
	}

	public void setHall(boolean hall) {
		this.hall = hall;
	}

	public boolean isAuditorium() {
		return auditorium;
	}

	public void setAuditorium(boolean auditorium) {
		this.auditorium = auditorium;
	}

	public boolean isHotel() {
		return hotel;
	}

	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}

	public boolean isRestaurants() {
		return restaurants;
	}

	public void setRestaurants(boolean restaurants) {
		this.restaurants = restaurants;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
}
