package com.ceic.mem.model.external;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceResponse implements Serializable {
	private static final long serialVersionUID = -7608591897563945814L;

	private String code;
	private String message;

	public ServiceResponse() {
	}

	public ServiceResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public ServiceResponse(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
