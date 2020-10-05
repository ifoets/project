package com.ceic.mem.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile")
public class UserProfileEntity implements Serializable {
	private static final long serialVersionUID = 3686074225896762417L;

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

	public UserProfileEntity() {
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

	@Column(name = "c_name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "c_profile_for", nullable = false)
	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
	}

	@Column(name = "i_age", nullable = false)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "c_height", nullable = false)
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Column(name = "c_religion", nullable = false)
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	@Column(name = "c_cast", nullable = false)
	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	@Column(name = "c_subcast")
	public String getSubcast() {
		return subcast;
	}

	public void setSubcast(String subcast) {
		this.subcast = subcast;
	}

	@Column(name = "c_location", nullable = false)
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "c_education", nullable = false)
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Column(name = "c_profession", nullable = false)
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column(name = "c_annual_income", nullable = false)
	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	@Column(name = "c_monthly_income", nullable = false)
	public String getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	@Column(name = "c_description", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "t_created_date", nullable = false)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "t_last_update_date", nullable = false)
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfileEntity other = (UserProfileEntity) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserProfileEntity [userId=" + userId + ", name=" + name + ", profileFor=" + profileFor + ", age=" + age
				+ ", height=" + height + ", religion=" + religion + ", cast=" + cast + ", subcast=" + subcast
				+ ", location=" + location + ", education=" + education + ", profession=" + profession
				+ ", annualIncome=" + annualIncome + ", monthlyIncome=" + monthlyIncome + ", description=" + description
				+ ", createdDate=" + createdDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}

}
