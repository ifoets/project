package com.ciec.mem.dto;

import java.io.Serializable;

public class PartnerPrefDTO implements Serializable {

	private static final long serialVersionUID = 360008322589690876L;

	private String userId;
	private Integer ageFrom;
	private Integer ageTo;
	private String maritalStatus;
	private String physicalStatus;
	private String eatingHabits;
	private String smokingHabits;
	private String drinkingHabits;
	private String motherTongue;
	private String caste;
	private String star;
	private Boolean manglik;
	private String unknown;
	
	public PartnerPrefDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartnerPrefDTO(String userId, Integer ageFrom, Integer ageTo, String maritalStatus, String physicalStatus,
			String eatingHabits, String smokingHabits, String drinkingHabits, String motherTongue, String caste,
			String star, Boolean manglik, String unknown) {
		super();
		this.userId = userId;
		this.ageFrom = ageFrom;
		this.ageTo = ageTo;
		this.maritalStatus = maritalStatus;
		this.physicalStatus = physicalStatus;
		this.eatingHabits = eatingHabits;
		this.smokingHabits = smokingHabits;
		this.drinkingHabits = drinkingHabits;
		this.motherTongue = motherTongue;
		this.caste = caste;
		this.star = star;
		this.manglik = manglik;
		this.unknown = unknown;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(Integer ageFrom) {
		this.ageFrom = ageFrom;
	}

	public Integer getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(Integer ageTo) {
		this.ageTo = ageTo;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPhysicalStatus() {
		return physicalStatus;
	}

	public void setPhysicalStatus(String physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	public String getEatingHabits() {
		return eatingHabits;
	}

	public void setEatingHabits(String eatingHabits) {
		this.eatingHabits = eatingHabits;
	}

	public String getSmokingHabits() {
		return smokingHabits;
	}

	public void setSmokingHabits(String smokingHabits) {
		this.smokingHabits = smokingHabits;
	}

	public String getDrinkingHabits() {
		return drinkingHabits;
	}

	public void setDrinkingHabits(String drinkingHabits) {
		this.drinkingHabits = drinkingHabits;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public Boolean getManglik() {
		return manglik;
	}

	public void setManglik(Boolean manglik) {
		this.manglik = manglik;
	}

	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}

	@Override
	public String toString() {
		return "PartnerPrefDTO [userId=" + userId + ", ageFrom=" + ageFrom + ", ageTo=" + ageTo + ", maritalStatus="
				+ maritalStatus + ", physicalStatus=" + physicalStatus + ", eatingHabits=" + eatingHabits
				+ ", smokingHabits=" + smokingHabits + ", drinkingHabits=" + drinkingHabits + ", motherTongue="
				+ motherTongue + ", caste=" + caste + ", star=" + star + ", manglik=" + manglik + ", unknown=" + unknown
				+ "]";
	}
	
}
