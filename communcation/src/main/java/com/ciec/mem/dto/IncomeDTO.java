package com.ciec.mem.dto;

import java.io.Serializable;

public class IncomeDTO implements Serializable {

	private static final long serialVersionUID = 360008322589690876L;

	private Integer id;
	private String yearly;
	private String monthly;

	public IncomeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IncomeDTO(String yearly) {
		super();
		this.yearly = yearly;
	}

	public IncomeDTO(Integer id, String yearly) {
		super();
		this.id = id;
		this.yearly = yearly;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getYearly() {
		if (yearly == null && monthly != null)
			return Integer.valueOf((Integer.valueOf(monthly) * 12)).toString();
		return yearly;
	}

	public void setYearly(String yearly) {
		this.yearly = yearly;
	}

	public String getMonthly() {
		if (monthly == null && yearly != null)
			return Integer.toUnsignedString(Integer.parseInt(getYearly()) / 12).toString();

		return monthly;
	}

	public void setMonthly(String monthly) {
		this.monthly = monthly;
	}

	@Override
	public String toString() {
		return "IncomeDTO [id=" + id + ", yearly=" + yearly + ", monthly=" + monthly + "]";
	}

}
