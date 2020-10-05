package com.ceic.mem.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_basic_details")
public class UserBasicDetailEntity implements Serializable {
	private static final long serialVersionUID = 368607420389690876L;

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

	public UserBasicDetailEntity() {
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

	@Column(name = "c_profile_for", nullable = false)
	public String getProfileFor() {
		return profileFor;
	}

	public void setProfileFor(String profileFor) {
		this.profileFor = profileFor;
	}

	@Column(name = "c_name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "c_body_type_complexion")
	public String getBodyTypeComplexion() {
		return bodyTypeComplexion;
	}

	public void setBodyTypeComplexion(String bodyTypeComplexion) {
		this.bodyTypeComplexion = bodyTypeComplexion;
	}

	@Column(name = "i_age", nullable = false)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "c_physical_status")
	public String getPhysicalStatus() {
		return physicalStatus;
	}

	public void setPhysicalStatus(String physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	@Column(name = "c_height", nullable = false)
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Column(name = "i_weight")
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Column(name = "c_mother_tongue")
	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	@Column(name = "c_marital_status")
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "c_eating_habits")
	public String getEatingHabits() {
		return eatingHabits;
	}

	public void setEatingHabits(String eatingHabits) {
		this.eatingHabits = eatingHabits;
	}

	@Column(name = "c_drinking_habits")
	public String getDrinkingHabits() {
		return drinkingHabits;
	}

	public void setDrinkingHabits(String drinkingHabits) {
		this.drinkingHabits = drinkingHabits;
	}

	@Column(name = "c_smoking_habits")
	public String getSmokingHabits() {
		return smokingHabits;
	}

	public void setSmokingHabits(String smokingHabits) {
		this.smokingHabits = smokingHabits;
	}

	@Column(name = "c_unknown1")
	public String getUnkonwn1() {
		return unkonwn1;
	}

	public void setUnkonwn1(String unkonwn1) {
		this.unkonwn1 = unkonwn1;
	}

	@Column(name = "c_unknown2")
	public String getUnknown2() {
		return unknown2;
	}

	public void setUnknown2(String unknown2) {
		this.unknown2 = unknown2;
	}

	@Column(name = "c_unknown3")
	public String getUnknown3() {
		return unknown3;
	}

	public void setUnknown3(String unknown3) {
		this.unknown3 = unknown3;
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
		UserBasicDetailEntity other = (UserBasicDetailEntity) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserBasicDetailEntity [userId=" + userId + ", profileFor=" + profileFor + ", name=" + name
				+ ", bodyTypeComplexion=" + bodyTypeComplexion + ", age=" + age + ", physicalStatus=" + physicalStatus
				+ ", height=" + height + ", weight=" + weight + ", motherTongue=" + motherTongue + ", maritalStatus="
				+ maritalStatus + ", eatingHabits=" + eatingHabits + ", drinkingHabits=" + drinkingHabits
				+ ", smokingHabits=" + smokingHabits + ", unkonwn1=" + unkonwn1 + ", unknown2=" + unknown2
				+ ", unknown3=" + unknown3 + "]";
	}

}
