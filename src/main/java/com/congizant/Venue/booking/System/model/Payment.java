package com.congizant.Venue.booking.System.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long paymentId;
	
	@Column(name="payementOption")
	private String paymentOption;
	
	@Column(name="price")
	private double price;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(long paymentId, String paymentOption, double price) {
		super();
		this.paymentId = paymentId;
		this.paymentOption = paymentOption;
		this.price = price;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
