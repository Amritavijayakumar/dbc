package com.dbc.deathbychocolate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRegisteration {
	@Id
	private String userEmail;
	private String userName,userCity,userAddress;
	private long userContact;
	private int userAge,userPincode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public int getUserPincode() {
		return userPincode;
	}
	public void setUserPincode(int userPincode) {
		this.userPincode = userPincode;
	}

}
