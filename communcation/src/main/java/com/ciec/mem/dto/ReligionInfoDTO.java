package com.ciec.mem.dto;

import java.io.Serializable;

public class ReligionInfoDTO implements Serializable {

	private static final long serialVersionUID = 368602922589690876L;

	private String userId;
	private String religion;
	private String castSubcaste;
	private String gothrams;
	private String starRassi;
	private String dosh;
	private String unknown1;
	private String unknown2;

	public ReligionInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReligionInfoDTO(String userId, String religion, String castSubcaste, String gothrams, String starRassi,
			String dosh, String unknown1, String unknown2) {
		super();
		this.userId = userId;
		this.religion = religion;
		this.castSubcaste = castSubcaste;
		this.gothrams = gothrams;
		this.starRassi = starRassi;
		this.dosh = dosh;
		this.unknown1 = unknown1;
		this.unknown2 = unknown2;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCastSubcaste() {
		return castSubcaste;
	}

	public void setCastSubcaste(String castSubcaste) {
		this.castSubcaste = castSubcaste;
	}

	public String getGothrams() {
		return gothrams;
	}

	public void setGothrams(String gothrams) {
		this.gothrams = gothrams;
	}

	public String getStarRassi() {
		return starRassi;
	}

	public void setStarRassi(String starRassi) {
		this.starRassi = starRassi;
	}

	public String getDosh() {
		return dosh;
	}

	public void setDosh(String dosh) {
		this.dosh = dosh;
	}

	public String getUnknown1() {
		return unknown1;
	}

	public void setUnknown1(String unknown1) {
		this.unknown1 = unknown1;
	}

	public String getUnknown2() {
		return unknown2;
	}

	public void setUnknown2(String unknown2) {
		this.unknown2 = unknown2;
	}

	@Override
	public String toString() {
		return "ReligionInfoDTO [userId=" + userId + ", religion=" + religion + ", castSubcaste=" + castSubcaste
				+ ", gothrams=" + gothrams + ", starRassi=" + starRassi + ", dosh=" + dosh + ", unknown1=" + unknown1
				+ ", unknown2=" + unknown2 + "]";
	}

}
