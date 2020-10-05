package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.UserRegistrationDTO;

public class UserRegistrationResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220419009833366983L;
	private UserRegistrationDTO userRegistrationDTO;

	public UserRegistrationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistrationResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public UserRegistrationResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public UserRegistrationResponse(String responseCode, UserRegistrationDTO userRegistrationDTO) {
		this(responseCode, null, userRegistrationDTO);
	}

	public UserRegistrationResponse(String responseCode, String message, UserRegistrationDTO userRegistrationDTO) {
		super(responseCode, message);
		this.setUserRegistrationDTO(userRegistrationDTO);
	}

	public UserRegistrationDTO getUserRegistrationDTO() {
		return userRegistrationDTO;
	}

	public void setUserRegistrationDTO(UserRegistrationDTO userRegistrationDTO) {
		this.userRegistrationDTO = userRegistrationDTO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static UserRegistrationResponse success(UserRegistrationDTO userRegistrationDTO) {
		return new UserRegistrationResponse(SUCCESS, null, userRegistrationDTO);
	}

	public static UserRegistrationResponse success(String message, UserRegistrationDTO userRegistrationDTO) {
		return new UserRegistrationResponse(SUCCESS, message, userRegistrationDTO);
	}

	public static UserRegistrationResponse notFound() {
		return new UserRegistrationResponse(NOT_FOUND, null, null);
	}

	public static UserRegistrationResponse notFound(String message) {
		return new UserRegistrationResponse(NOT_FOUND, message, null);
	}

	public static UserRegistrationResponse notFound(String responseCode, String message) {
		return new UserRegistrationResponse(responseCode, message, null);
	}

	public static UserRegistrationResponse internalError() {
		return new UserRegistrationResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static UserRegistrationResponse internalError(String message) {
		return new UserRegistrationResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static UserRegistrationResponse internalError(String responseCode, String message) {
		return new UserRegistrationResponse(responseCode, message, null);
	}
}
