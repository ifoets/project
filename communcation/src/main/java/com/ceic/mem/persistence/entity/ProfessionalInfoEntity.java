package com.ceic.mem.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professional_information")
public class ProfessionalInfoEntity implements Serializable {
	private static final long serialVersionUID = 3686013115896709417L;

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

	public ProfessionalInfoEntity() {
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

	@Column(name = "c_education")
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Column(name = "c_college_institution")
	public String getCollegeInstitution() {
		return collegeInstitution;
	}

	public void setCollegeInstitution(String collegeInstitution) {
		this.collegeInstitution = collegeInstitution;
	}

	@Column(name = "c_education_detail")
	public String getEducationDetail() {
		return educationDetail;
	}

	public void setEducationDetail(String educationDetail) {
		this.educationDetail = educationDetail;
	}

	@Column(name = "c_occupation")
	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Column(name = "c_occupation_detail")
	public String getOccupationDetail() {
		return occupationDetail;
	}

	public void setOccupationDetail(String occupationDetail) {
		this.occupationDetail = occupationDetail;
	}

	@Column(name = "c_employee_in")
	public String getEmployeeIn() {
		return employeeIn;
	}

	public void setEmployeeIn(String employeeIn) {
		this.employeeIn = employeeIn;
	}

	@Column(name = "c_annual_income")
	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	@Column(name = "c_monthly_income")
	public String getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	@Column(name = "c_unknown")
	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}

}
