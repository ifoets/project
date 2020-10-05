package com.ciec.mem.dto;

import java.io.Serializable;
import java.util.Date;

public class UserLoginDTO implements Serializable {

	private static final long serialVersionUID = 368607422589690876L;

	private String userId;
	private String emailId;
	private String mobileNo;
	private String userStatus;
	private Boolean loginStatus;
	private Date loginTime;
	private Date logoutTime;

	public UserLoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginDTO(String userId, String emailId, String mobileNo, String userStatus, Boolean loginStatus,
			Date loginTime, Date logoutTime) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.userStatus = userStatus;
		this.loginStatus = loginStatus;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Boolean getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(Boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	@Override
	public String toString() {
		return "UserLoginDTO [userId=" + userId + ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", userStatus="
				+ userStatus + ", loginStatus=" + loginStatus + ", loginTime=" + loginTime + ", logoutTime="
				+ logoutTime + "]";
	}

}
