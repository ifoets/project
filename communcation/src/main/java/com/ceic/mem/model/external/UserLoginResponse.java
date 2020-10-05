package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.UserLoginDTO;

public class UserLoginResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220419009833366967L;
	private UserLoginDTO userLoginDTO;

	public UserLoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public UserLoginResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public UserLoginResponse(String responseCode, UserLoginDTO userLoginDTO) {
		this(responseCode, null, userLoginDTO);
	}

	public UserLoginResponse(String responseCode, String message, UserLoginDTO userLoginDTO) {
		super(responseCode, message);
		this.setUserLoginDTO(userLoginDTO);
	}

	public UserLoginDTO getUserLoginDTO() {
		return userLoginDTO;
	}

	public void setUserLoginDTO(UserLoginDTO userLoginDTO) {
		this.userLoginDTO = userLoginDTO;
	}

	public static UserLoginResponse success(UserLoginDTO userLoginDTO) {
		return new UserLoginResponse(SUCCESS, null, userLoginDTO);
	}

	public static UserLoginResponse success(String message, UserLoginDTO userLoginDTO) {
		return new UserLoginResponse(SUCCESS, message, userLoginDTO);
	}

	public static UserLoginResponse notFound() {
		return new UserLoginResponse(NOT_FOUND, null, null);
	}

	public static UserLoginResponse notFound(String message) {
		return new UserLoginResponse(NOT_FOUND, message, null);
	}

	public static UserLoginResponse notFound(String responseCode, String message) {
		return new UserLoginResponse(responseCode, message, null);
	}

	public static UserLoginResponse internalError() {
		return new UserLoginResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static UserLoginResponse internalError(String message) {
		return new UserLoginResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static UserLoginResponse internalError(String responseCode, String message) {
		return new UserLoginResponse(responseCode, message, null);
	}
}
