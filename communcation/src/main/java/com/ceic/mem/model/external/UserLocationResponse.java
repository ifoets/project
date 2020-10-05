package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.UserLocationDTO;

public class UserLocationResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220419002833366967L;
	private UserLocationDTO userLocationDTO;

	public UserLocationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLocationResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public UserLocationResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public UserLocationResponse(String responseCode, UserLocationDTO userLocationDTO) {
		this(responseCode, null, userLocationDTO);
	}

	public UserLocationResponse(String responseCode, String message, UserLocationDTO userLocationDTO) {
		super(responseCode, message);
		this.setUserLocationDTO(userLocationDTO);
	}

	public UserLocationDTO getUserLocationDTO() {
		return userLocationDTO;
	}

	public void setUserLocationDTO(UserLocationDTO userLocationDTO) {
		this.userLocationDTO = userLocationDTO;
	}

	public static UserLocationResponse success(UserLocationDTO userLocationDTO) {
		return new UserLocationResponse(SUCCESS, null, userLocationDTO);
	}

	public static UserLocationResponse success(String message, UserLocationDTO userLocationDTO) {
		return new UserLocationResponse(SUCCESS, message, userLocationDTO);
	}

	public static UserLocationResponse notFound() {
		return new UserLocationResponse(NOT_FOUND, null, null);
	}

	public static UserLocationResponse notFound(String message) {
		return new UserLocationResponse(NOT_FOUND, message, null);
	}

	public static UserLocationResponse notFound(String responseCode, String message) {
		return new UserLocationResponse(responseCode, message, null);
	}

	public static UserLocationResponse internalError() {
		return new UserLocationResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static UserLocationResponse internalError(String message) {
		return new UserLocationResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static UserLocationResponse internalError(String responseCode, String message) {
		return new UserLocationResponse(responseCode, message, null);
	}
}
