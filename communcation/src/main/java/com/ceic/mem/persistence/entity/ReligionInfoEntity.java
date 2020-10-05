package com.ceic.mem.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "religion_information")
public class ReligionInfoEntity implements Serializable {
	private static final long serialVersionUID = 3686074225896709417L;

	private String userId;
	private String religion;
	private String castSubcaste;
	private String gothrams;
	private String starRassi;
	private String dosh;
	private String unknown1;
	private String unknown2;

	public ReligionInfoEntity() {
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

	@Column(name = "c_religion")
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	@Column(name = "c_cast_subcaste")
	public String getCastSubcaste() {
		return castSubcaste;
	}

	public void setCastSubcaste(String castSubcaste) {
		this.castSubcaste = castSubcaste;
	}

	@Column(name = "c_gothrams")
	public String getGothrams() {
		return gothrams;
	}

	public void setGothrams(String gothrams) {
		this.gothrams = gothrams;
	}

	@Column(name = "c_star_rassi")
	public String getStarRassi() {
		return starRassi;
	}

	public void setStarRassi(String starRassi) {
		this.starRassi = starRassi;
	}

	@Column(name = "c_dosh")
	public String getDosh() {
		return dosh;
	}

	public void setDosh(String dosh) {
		this.dosh = dosh;
	}

	@Column(name = "c_unknown1")
	public String getUnknown1() {
		return unknown1;
	}

	public void setUnknown1(String unknown1) {
		this.unknown1 = unknown1;
	}

	@Column(name = "c_unknown2")
	public String getUnknown2() {
		return unknown2;
	}

	public void setUnknown2(String unknown2) {
		this.unknown2 = unknown2;
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
		ReligionInfoEntity other = (ReligionInfoEntity) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReligionInfoEntity [userId=" + userId + ", religion=" + religion + ", castSubcaste=" + castSubcaste
				+ ", gothrams=" + gothrams + ", starRassi=" + starRassi + ", dosh=" + dosh + ", unknown1=" + unknown1
				+ ", unknown2=" + unknown2 + "]";
	}

}
