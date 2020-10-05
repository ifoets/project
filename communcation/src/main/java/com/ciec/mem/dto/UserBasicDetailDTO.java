package com.ciec.mem.dto;

import java.io.Serializable;

public class UserBasicDetailDTO implements Serializable {

	private static final long serialVersionUID = 3680084225896762417L;

	private String userId;
	private String profileFor;
	private String name;
	private String bodyTypeComplexion;
	private Integer age;
	private String physicalStatus;
	private String height;
	private Integer weight;
	private String motherTongue;
	private String maritalStatus;
	private String eatingHabits;
	private String drinkingHabits;
	private String smokingHabits;
	private String unkonwn1;
	private String unknown2;
	private String unknown3;

	public UserBasicDetailDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBasicDetailDTO(String userId, String profileFor, String name, String bodyTypeComplexion, Integer age,
			String physicalStatus, String height, Integer weight, String motherTongue, String maritalStatus,
			String eatingHabits, String drinkingHabits, String smokingHabits, String unkonwn1, String unknown2,
			String unknown3) {
		super();
		this.userId = userId;
		this.profileFor = profileFor;
		this.name = name;
		this.bodyTypeComplexion = bodyTypeComplexion;
		this.age = age;
		this.physicalStatus = physicalStatus;
		this.height = height;
		this.weight = weight;
		this.motherTongue = motherTongue;
		this.maritalStatus = maritalStatus;
		this.eatingHabits = eatingHabits;
		this.drinkingHabits = drinkingHabits;
		this.smokingHabits = smokingHabits;
		this.unkonwn1 = unkonwn1;
		this.unknown2 = unknown2;
		this.unknown3 = unknown3;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBodyTypeComplexion() {
		return bodyTypeComplexion;
	}

	public void setBodyTypeComplexion(String bodyTypeComplexion) {
		this.bodyTypeComplexion = bodyTypeComplexion;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhysicalStatus() {
		return physicalStatus;
	}

	public void setPhysicalStatus(String physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEatingHabits() {
		return eatingHabits;
	}

	public void setEatingHabits(String eatingHabits) {
		this.eatingHabits = eatingHabits;
	}

	public String getDrinkingHabits() {
		return drinkingHabits;
	}

	public void setDrinkingHabits(String drinkingHabits) {
		this.drinkingHabits = drinkingHabits;
	}

	public String getSmokingHabits() {
		return smokingHabits;
	}

	public void setSmokingHabits(String smokingHabits) {
		this.smokingHabits = smokingHabits;
	}

	public String getUnkonwn1() {
		return unkonwn1;
	}

	public void setUnkonwn1(String unkonwn1) {
		this.unkonwn1 = unkonwn1;
	}

	public String getUnknown2() {
		return unknown2;
	}

	public void setUnknown2(String unknown2) {
		this.unknown2 = unknown2;
	}

	public String getUnknown3() {
		return unknown3;
	}

	public void setUnknown3(String unknown3) {
		this.unknown3 = unknown3;
	}

	@Override
	public String toString() {
		return "UserBasicDetailDTO [userId=" + userId + ", profileFor=" + profileFor + ", name=" + name
				+ ", bodyTypeComplexion=" + bodyTypeComplexion + ", age=" + age + ", physicalStatus=" + physicalStatus
				+ ", height=" + height + ", weight=" + weight + ", motherTongue=" + motherTongue + ", maritalStatus="
				+ maritalStatus + ", eatingHabits=" + eatingHabits + ", drinkingHabits=" + drinkingHabits
				+ ", smokingHabits=" + smokingHabits + ", unkonwn1=" + unkonwn1 + ", unknown2=" + unknown2
				+ ", unknown3=" + unknown3 + "]";
	}

}
