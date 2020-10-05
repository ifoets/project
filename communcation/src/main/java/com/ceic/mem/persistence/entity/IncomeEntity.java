package com.ceic.mem.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "income")
public class IncomeEntity implements Serializable {

	private static final long serialVersionUID = 3609038322589690876L;

	private Integer id;
	private String yearly;
	private String monthly;

	public IncomeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "c_yearly", unique = true, nullable = false)
	public String getYearly() {
		if (yearly == null && monthly != null)
			return Integer.valueOf((Integer.valueOf(monthly) * 12)).toString();
		return yearly;
	}

	public void setYearly(String yearly) {
		this.yearly = yearly;
	}

	@Column(name = "c_monthly", unique = true, nullable = false)
	public String getMonthly() {
		if (monthly == null && yearly != null)
			return Integer.toUnsignedString(Integer.parseInt(getYearly()) / 12).toString();
		return monthly;
	}

	public void setMonthly(String monthly) {
		this.monthly = monthly;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((monthly == null) ? 0 : monthly.hashCode());
		result = prime * result + ((yearly == null) ? 0 : yearly.hashCode());
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
		IncomeEntity other = (IncomeEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (monthly == null) {
			if (other.monthly != null)
				return false;
		} else if (!monthly.equals(other.monthly))
			return false;
		if (yearly == null) {
			if (other.yearly != null)
				return false;
		} else if (!yearly.equals(other.yearly))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IncomeDTO [id=" + id + ", yearly=" + yearly + ", monthly=" + monthly + "]";
	}

}
