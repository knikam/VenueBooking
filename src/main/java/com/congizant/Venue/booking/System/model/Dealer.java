package com.congizant.Venue.booking.System.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dealer")
public class Dealer {

	@Id
	@Column(name="loginId")
	private String loginId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dealer(String loginId, String name, String password, String email, Set<Venue> venues,
			Set<com.congizant.Venue.booking.System.model.Booking> booking) {
		super();
		this.loginId = loginId;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
