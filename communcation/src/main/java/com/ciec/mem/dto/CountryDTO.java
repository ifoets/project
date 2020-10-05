package com.ciec.mem.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable {

	private static final long serialVersionUID = 360008322589690876L;

	private Integer id;
	private Integer countryCode;
	private String countryName;

	public CountryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountryDTO(Integer countryCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}

}
