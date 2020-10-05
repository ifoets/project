package com.ceic.mem.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_location")
public class UserLocationEntity implements Serializable {

	private static final long serialVersionUID = 368607422389690876L;

	private String userId;
	private String city;
	private String state;
	private String country;
	private String citizenship;

	public UserLocationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "c_user_id", unique = true, nullable = false)
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "c_city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "c_state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "c_country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "c_citizenship")
	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	@Override
	public String toString() {
		return "UserLocationEntity [userId=" + userId + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", citizenship=" + citizenship + "]";
	}

}
