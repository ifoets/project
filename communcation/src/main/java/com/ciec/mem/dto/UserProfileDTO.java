package com.ciec.mem.dto;

import java.io.Serializable;
import java.util.Date;

public class UserProfileDTO implements Serializable {

	private static final long serialVersionUID = 3686074225896762421L;

	private String userId;
	private String name;
	private String profileFor;
	private Integer age;
	private String height;
	private String religion;
	private String cast;
	private String subcast;
	private String location;
	private String education;
	private String profession;
	private String annualIncome;
	private String monthlyIncome;
	private String description;
	private Date createdDate;
	private Date lastUpdateDate;

	public UserProfileDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfileDTO(String userId, String name, String profileFor, Integer age, String height, String religion,
			String cast, String subcast, String location, String education, String profession, String annualIncome,
			String monthlyIncome, String description, Date createdDate, Date lastUpdateDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.profileFor = profileFor;
		this.age = age;
		this.height = height;
		this.religion = religion;
		this.cast = cast;
		this.subcast = subcast;
		this.location = location;
		this.education = education;
		this.profession = profession;
		this.annualIncome = annualIncome;
		this.monthlyIncome = monthlyIncome;
		this.description = description;
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getSubcast() {
		return subcast;
	}

	public void setSubcast(String subcast) {
		this.subcast = subcast;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public String toString() {
		return "UserProfileDTO [userId=" + userId + ", name=" + name + ", profileFor=" + profileFor + ", age=" + age
				+ ", height=" + height + ", religion=" + religion + ", cast=" + cast + ", subcast=" + subcast
				+ ", location=" + location + ", education=" + education + ", profession=" + profession
				+ ", annualIncome=" + annualIncome + ", monthlyIncome=" + monthlyIncome + ", description=" + description
				+ ", createdDate=" + createdDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}

}
