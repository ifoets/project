package com.ciec.mem.dto;

import java.io.Serializable;

public class UserLocationDTO implements Serializable {

	private static final long serialVersionUID = 3686084225896762417L;

	private String userId;
	private String city;
	private String state;
	private String country;
	private String citizenship;

	public UserLocationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLocationDTO(String userId, String city, String state, String country, String citizenship) {
		super();
		this.userId = userId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.citizenship = citizenship;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	@Override
	public String toString() {
		return "UserLocationDTO [userId=" + userId + ", city=" + city + ", country=" + country + ", citizenship="
				+ citizenship + "]";
	}

}
