package com.ciec.mem.dto;

import java.io.Serializable;

public class OccupationDTO implements Serializable {

	private static final long serialVersionUID = 360008322589690876L;

	private Integer id;
	private String occupation;

	public OccupationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OccupationDTO(String occupation) {
		super();
		this.occupation = occupation;
	}

	public OccupationDTO(Integer id, String occupation) {
		super();
		this.id = id;
		this.occupation = occupation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "OccupationDTO [id=" + id + ", occupation=" + occupation + "]";
	}

}
