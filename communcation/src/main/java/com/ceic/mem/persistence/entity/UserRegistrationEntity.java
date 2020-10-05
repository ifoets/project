package com.ceic.mem.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_registration")
public class UserRegistrationEntity implements Serializable {
	private static final long serialVersionUID = 3686074225896762416L;
	private String userId;
	private String mobileNo;
	private String emailId;
	private String userFor;
	private String gender;
	private Date dob;
	private String motherTongue;
	private String castDivision;
	private String livingCountry;
	private String loginPasword;
	private Date createdDate;
	private Date lastUpdateDate;
	private Date deletedDate;

	public UserRegistrationEntity() {
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

	@Column(name = "c_mobile_no", unique = true, nullable = false)
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "c_email_id", unique = true, nullable = false)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "c_user_for", nullable = false)
	public String getUserFor() {
		return userFor;
	}

	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}

	@Column(name = "c_gender", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "t_dob", nullable = false)
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "c_mother_tongue", nullable = false)
	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	@Column(name = "c_cast_division", nullable = false)
	public String getCastDivision() {
		return castDivision;
	}

	public void setCastDivision(String castDivision) {
		this.castDivision = castDivision;
	}

	@Column(name = "c_living_country", nullable = false)
	public String getLivingCountry() {
		return livingCountry;
	}

	public void setLivingCountry(String livingCountry) {
		this.livingCountry = livingCountry;
	}

	@Column(name = "c_login_password", nullable = false)
	public String getLoginPasword() {
		return loginPasword;
	}

	public void setLoginPasword(String loginPasword) {
		this.loginPasword = loginPasword;
	}

	@Column(name = "t_created_date")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "t_last_update_date")
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Column(name = "c_deleted_date")
	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
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
		UserRegistrationEntity other = (UserRegistrationEntity) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserRegistrationEntity [userId=" + userId + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", userFor=" + userFor + ", gender=" + gender + ", dob=" + dob + ", motherTongue=" + motherTongue
				+ ", castDivision=" + castDivision + ", livingCountry=" + livingCountry + ", loginPasword="
				+ loginPasword + ", createdDate=" + createdDate + ", lastUpdateDate=" + lastUpdateDate
				+ ", deletedDate=" + deletedDate + "]";
	}

}
