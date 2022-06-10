package com.congizant.Venue.booking.System.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookingStatus")
public class BookingStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	
	@Column(name="Status")
	private String Status;

	public BookingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingStatus(long bookingId, String status) {
		super();
		this.bookingId = bookingId;
		Status = status;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
}
