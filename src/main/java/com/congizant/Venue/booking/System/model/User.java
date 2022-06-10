package com.congizant.Venue.booking.System.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dob")
	private String dateOfBirth;
	
	@Column(name="gender")
	private String gender;	


	public User() {
		
	}

	public User(String username, String name, String password, String email, String dateOfBirth, String gender) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public String getLoginId() {
		return username;
	}

	public void setLoginId(String username) {
		this.username = username;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
			
}
