package com.ciec.mem.dto;

import java.io.Serializable;

public class FamilyDetailsDTO implements Serializable {

	private static final long serialVersionUID = 360008322589690876L;

	private String userId;
	private String fatherStatus;
	private String familyValue;
	private String motherStatus;
	private String familyType;
	private Integer noOfBorhers;
	private String familyStatus;
	private Integer noOfSisters;
	private String aboutFaimly;
	private String unkonwn;

	public FamilyDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyDetailsDTO(String userId, String fatherStatus, String familyValue, String motherStatus,
			String familyType, Integer noOfBorhers, String familyStatus, Integer noOfSisters, String aboutFaimly,
			String unkonwn) {
		super();
		this.userId = userId;
		this.fatherStatus = fatherStatus;
		this.familyValue = familyValue;
		this.motherStatus = motherStatus;
		this.familyType = familyType;
		this.noOfBorhers = noOfBorhers;
		this.familyStatus = familyStatus;
		this.noOfSisters = noOfSisters;
		this.aboutFaimly = aboutFaimly;
		this.unkonwn = unkonwn;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFatherStatus() {
		return fatherStatus;
	}

	public void setFatherStatus(String fatherStatus) {
		this.fatherStatus = fatherStatus;
	}

	public String getFamilyValue() {
		return familyValue;
	}

	public void setFamilyValue(String familyValue) {
		this.familyValue = familyValue;
	}

	public String getMotherStatus() {
		return motherStatus;
	}

	public void setMotherStatus(String motherStatus) {
		this.motherStatus = motherStatus;
	}

	public String getFamilyType() {
		return familyType;
	}

	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}

	public Integer getNoOfBorhers() {
		return noOfBorhers;
	}

	public void setNoOfBorhers(Integer noOfBorhers) {
		this.noOfBorhers = noOfBorhers;
	}

	public String getFamilyStatus() {
		return familyStatus;
	}

	public void setFamilyStatus(String familyStatus) {
		this.familyStatus = familyStatus;
	}

	public Integer getNoOfSisters() {
		return noOfSisters;
	}

	public void setNoOfSisters(Integer noOfSisters) {
		this.noOfSisters = noOfSisters;
	}

	public String getAboutFaimly() {
		return aboutFaimly;
	}

	public void setAboutFaimly(String aboutFaimly) {
		this.aboutFaimly = aboutFaimly;
	}

	public String getUnkonwn() {
		return unkonwn;
	}

	public void setUnkonwn(String unkonwn) {
		this.unkonwn = unkonwn;
	}

	@Override
	public String toString() {
		return "FamilyDetailsDTO [userId=" + userId + ", fatherStatus=" + fatherStatus + ", familyValue=" + familyValue
				+ ", motherStatus=" + motherStatus + ", familyType=" + familyType + ", noOfBorhers=" + noOfBorhers
				+ ", noOfSisters=" + noOfSisters + ", aboutFaimly=" + aboutFaimly + ", unkonwn=" + unkonwn + "]";
	}

}
