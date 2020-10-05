package com.ciec.mem.dto;

import java.io.Serializable;

public class ProfessionalInfoDTO implements Serializable {

	private static final long serialVersionUID = 368678322989690876L;

	private String userId;
	private String education;
	private String collegeInstitution;
	private String educationDetail;
	private String occupation;
	private String occupationDetail;
	private String employeeIn;
	private String annualIncome;
	private String monthlyIncome;
	private String unknown;

	public ProfessionalInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessionalInfoDTO(String userId, String education, String collegeInstitution, String educationDetail,
			String occupation, String occupationDetail, String employeeIn, String annualIncome, String monthlyIncome,
			String unknown) {
		super();
		this.userId = userId;
		this.education = education;
		this.collegeInstitution = collegeInstitution;
		this.educationDetail = educationDetail;
		this.occupation = occupation;
		this.occupationDetail = occupationDetail;
		this.employeeIn = employeeIn;
		this.annualIncome = annualIncome;
		this.monthlyIncome = monthlyIncome;
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

	public String getCollegeInstitution() {
		return collegeInstitution;
	}

	public void setCollegeInstitution(String collegeInstitution) {
		this.collegeInstitution = collegeInstitution;
	}

	public String getEducationDetail() {
		return educationDetail;
	}

	public void setEducationDetail(String educationDetail) {
		this.educationDetail = educationDetail;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOccupationDetail() {
		return occupationDetail;
	}

	public void setOccupationDetail(String occupationDetail) {
		this.occupationDetail = occupationDetail;
	}

	public String getEmployeeIn() {
		return employeeIn;
	}

	public void setEmployeeIn(String employeeIn) {
		this.employeeIn = employeeIn;
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

	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}

	@Override
	public String toString() {
		return "ProfessionalInfoDTO [userId=" + userId + ", education=" + education + ", collegeInstitution="
				+ collegeInstitution + ", educationDetail=" + educationDetail + ", occupation=" + occupation
				+ ", occupationDetail=" + occupationDetail + ", employeeIn=" + employeeIn + ", annualIncome="
				+ annualIncome + ", monthlyIncome=" + monthlyIncome + ", unknown=" + unknown + "]";
	}

}
