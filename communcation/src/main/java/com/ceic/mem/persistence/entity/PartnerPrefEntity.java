package com.ceic.mem.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "partner_preference")
public class PartnerPrefEntity implements Serializable {
	private static final long serialVersionUID = 3686013225006709417L;

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

	public PartnerPrefEntity() {
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

	@Column(name = "i_age_from")
	public Integer getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(Integer ageFrom) {
		this.ageFrom = ageFrom;
	}

	@Column(name = "i_age_to")
	public Integer getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(Integer ageTo) {
		this.ageTo = ageTo;
	}

	@Column(name = "c_marital_status")
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "c_physical_status")
	public String getPhysicalStatus() {
		return physicalStatus;
	}

	public void setPhysicalStatus(String physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	@Column(name = "c_eating_habits")
	public String getEatingHabits() {
		return eatingHabits;
	}

	public void setEatingHabits(String eatingHabits) {
		this.eatingHabits = eatingHabits;
	}

	@Column(name = "c_smoking_habits")
	public String getSmokingHabits() {
		return smokingHabits;
	}

	public void setSmokingHabits(String smokingHabits) {
		this.smokingHabits = smokingHabits;
	}

	@Column(name = "c_drinking_habits")
	public String getDrinkingHabits() {
		return drinkingHabits;
	}

	public void setDrinkingHabits(String drinkingHabits) {
		this.drinkingHabits = drinkingHabits;
	}

	@Column(name = "c_mother_tongue")
	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	@Column(name = "c_caste")
	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	@Column(name = "c_star")
	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	@Column(name = "b_manglik")
	public Boolean getManglik() {
		return manglik;
	}

	public void setManglik(Boolean manglik) {
		this.manglik = manglik;
	}

	@Column(name = "c_unknown")
	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
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
		PartnerPrefEntity other = (PartnerPrefEntity) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PartnerPrefEntity [userId=" + userId + ", ageFrom=" + ageFrom + ", ageTo=" + ageTo + ", maritalStatus="
				+ maritalStatus + ", physicalStatus=" + physicalStatus + ", eatingHabits=" + eatingHabits
				+ ", smokingHabits=" + smokingHabits + ", drinkingHabits=" + drinkingHabits + ", motherTongue="
				+ motherTongue + ", caste=" + caste + ", star=" + star + ", manglik=" + manglik + ", unknown=" + unknown
				+ "]";
	}

}
