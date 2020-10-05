package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.UserProfileDTO;

public class UserProfileResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220419009833366967L;
	private UserProfileDTO userProfileDTO;

	public UserProfileResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfileResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public UserProfileResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public UserProfileResponse(String responseCode, UserProfileDTO userProfileDTO) {
		this(responseCode, null, userProfileDTO);
	}

	public UserProfileResponse(String responseCode, String message, UserProfileDTO userProfileDTO) {
		super(responseCode, message);
		this.setUserProfileDTO(userProfileDTO);
	}

	public UserProfileDTO getUserProfileDTO() {
		return userProfileDTO;
	}

	public void setUserProfileDTO(UserProfileDTO userProfileDTO) {
		this.userProfileDTO = userProfileDTO;
	}

	public static UserProfileResponse success(UserProfileDTO userProfileDTO) {
		return new UserProfileResponse(SUCCESS, null, userProfileDTO);
	}

	public static UserProfileResponse success(String message, UserProfileDTO userProfileDTO) {
		return new UserProfileResponse(SUCCESS, message, userProfileDTO);
	}

	public static UserProfileResponse notFound() {
		return new UserProfileResponse(NOT_FOUND, null, null);
	}

	public static UserProfileResponse notFound(String message) {
		return new UserProfileResponse(NOT_FOUND, message, null);
	}

	public static UserProfileResponse notFound(String responseCode, String message) {
		return new UserProfileResponse(responseCode, message, null);
	}

	public static UserProfileResponse internalError() {
		return new UserProfileResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static UserProfileResponse internalError(String message) {
		return new UserProfileResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static UserProfileResponse internalError(String responseCode, String message) {
		return new UserProfileResponse(responseCode, message, null);
	}
}
