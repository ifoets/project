package com.ciec.mem.dto;

import java.io.Serializable;
import java.util.Date;

public class UserRegistrationDTO implements Serializable {

	private static final long serialVersionUID = 3686074225896762415L;

	String userId;
	String mobileNo;
	String emailId;
	String userFor;
	String gender;
	Date dob;
	String motherTongue;
	String castDivision;
	String livingCountry;
	String loginPasword;
	Date createdDate;
	Date lastUpdateDate;
	Date deletedDate;

	public UserRegistrationDTO() {
		super();
	}

	public UserRegistrationDTO(String userId, String mobileNo, String emailId, String userFor, String gender, Date dob,
			String motherTongue, String castDivision, String livingCountry, String loginPasword, Date createdDate,
			Date lastUpdateDate, Date deletedDate) {
		super();
		this.userId = userId;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.userFor = userFor;
		this.gender = gender;
		this.dob = dob;
		this.motherTongue = motherTongue;
		this.castDivision = castDivision;
		this.livingCountry = livingCountry;
		this.loginPasword = loginPasword;
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
		this.deletedDate = deletedDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserFor() {
		return userFor;
	}

	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getCastDivision() {
		return castDivision;
	}

	public void setCastDivision(String castDivision) {
		this.castDivision = castDivision;
	}

	public String getLivingCountry() {
		return livingCountry;
	}

	public void setLivingCountry(String livingCountry) {
		this.livingCountry = livingCountry;
	}

	public String getLoginPasword() {
		return loginPasword;
	}

	public void setLoginPasword(String loginPasword) {
		this.loginPasword = loginPasword;
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

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	@Override
	public String toString() {
		return "UserRegistrationDTO [userId=" + userId + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", userFor=" + userFor + ", gender=" + gender + ", dob=" + dob + ", motherTongue=" + motherTongue
				+ ", castDivision=" + castDivision + ", livingCountry=" + livingCountry + ", loginPasword="
				+ loginPasword + ", createdDate=" + createdDate + ", lastUpdateDate=" + lastUpdateDate
				+ ", deletedDate=" + deletedDate + "]";
	}
}
