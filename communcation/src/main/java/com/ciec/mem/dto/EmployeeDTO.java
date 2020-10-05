package com.ciec.mem.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 360008322589690876L;

	private Integer id;
	private String employee;

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(String employee) {
		super();
		this.employee = employee;
	}

	public EmployeeDTO(Integer id, String employee) {
		super();
		this.id = id;
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", employee=" + employee + "]";
	}

}
