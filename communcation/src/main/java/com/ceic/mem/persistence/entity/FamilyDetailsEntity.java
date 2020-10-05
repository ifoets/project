package com.ceic.mem.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "family_details")
public class FamilyDetailsEntity implements Serializable {

	private static final long serialVersionUID = 3609038322589690876L;

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

	public FamilyDetailsEntity() {
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

	@Column(name = "c_father_status")
	public String getFatherStatus() {
		return fatherStatus;
	}

	public void setFatherStatus(String fatherStatus) {
		this.fatherStatus = fatherStatus;
	}

	@Column(name = "c_family_value")
	public String getFamilyValue() {
		return familyValue;
	}

	public void setFamilyValue(String familyValue) {
		this.familyValue = familyValue;
	}

	@Column(name = "c_mother_status")
	public String getMotherStatus() {
		return motherStatus;
	}

	public void setMotherStatus(String motherStatus) {
		this.motherStatus = motherStatus;
	}

	@Column(name = "c_family_type")

	public String getFamilyType() {
		return familyType;
	}

	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}

	@Column(name = "i_no_of_brothers")
	public Integer getNoOfBorhers() {
		return noOfBorhers;
	}

	public void setNoOfBorhers(Integer noOfBorhers) {
		this.noOfBorhers = noOfBorhers;
	}

	@Column(name = "c_family_status")
	public String getFamilyStatus() {
		return familyStatus;
	}

	public void setFamilyStatus(String familyStatus) {
		this.familyStatus = familyStatus;
	}

	@Column(name = "i_no_of_sisters")
	public Integer getNoOfSisters() {
		return noOfSisters;
	}

	public void setNoOfSisters(Integer noOfSisters) {
		this.noOfSisters = noOfSisters;
	}

	@Column(name = "c_about_family")
	public String getAboutFaimly() {
		return aboutFaimly;
	}

	public void setAboutFaimly(String aboutFaimly) {
		this.aboutFaimly = aboutFaimly;
	}

	@Column(name = "c_unknown")
	public String getUnkonwn() {
		return unkonwn;
	}

	public void setUnkonwn(String unkonwn) {
		this.unkonwn = unkonwn;
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
		FamilyDetailsEntity other = (FamilyDetailsEntity) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FamilyDetailsEntity [userId=" + userId + ", fatherStatus=" + fatherStatus + ", familyValue="
				+ familyValue + ", motherStatus=" + motherStatus + ", familyType=" + familyType + ", noOfBorhers="
				+ noOfBorhers + ", familyStatus=" + familyStatus + ", noOfSisters=" + noOfSisters + ", aboutFaimly="
				+ aboutFaimly + ", unkonwn=" + unkonwn + "]";
	}

}
