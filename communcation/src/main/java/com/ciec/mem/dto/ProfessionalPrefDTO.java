package com.ciec.mem.dto;

import java.io.Serializable;

public class ProfessionalPrefDTO implements Serializable {

	private static final long serialVersionUID = 368678322589690876L;

	private String userId;
	private String education;
	private String occupation;
	private String annualIncome;
	private String unknown;
	
	public ProfessionalPrefDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfessionalPrefDTO(String userId, String education, String occupation, String annualIncome,
			String unknown) {
		super();
		this.userId = userId;
		this.education = education;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.unknown = unknown;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}

	@Override
	public String toString() {
		return "ProfessionalPrefDTO [userId=" + userId + ", education=" + education + ", occupation=" + occupation
				+ ", annualIncome=" + annualIncome + ", unknown=" + unknown + "]";
	}

	

}
