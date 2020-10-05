package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.UserBasicDetailDTO;

public class UserBasicDetailResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220419009833364767L;
	private UserBasicDetailDTO uSserBasicDetailDTO;

	public UserBasicDetailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBasicDetailResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public UserBasicDetailResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public UserBasicDetailResponse(String responseCode, UserBasicDetailDTO userBasicDetailDTO) {
		this(responseCode, null, userBasicDetailDTO);
	}

	public UserBasicDetailResponse(String responseCode, String message, UserBasicDetailDTO userBasicDetailDTO) {
		super(responseCode, message);
		this.setuSserBasicDetailDTO(userBasicDetailDTO);
	}

	public UserBasicDetailDTO getuSserBasicDetailDTO() {
		return uSserBasicDetailDTO;
	}

	public void setuSserBasicDetailDTO(UserBasicDetailDTO uSserBasicDetailDTO) {
		this.uSserBasicDetailDTO = uSserBasicDetailDTO;
	}

	public static UserBasicDetailResponse success(UserBasicDetailDTO userBasicDetailDTO) {
		return new UserBasicDetailResponse(SUCCESS, null, userBasicDetailDTO);
	}

	public static UserBasicDetailResponse success(String message, UserBasicDetailDTO userBasicDetailDTO) {
		return new UserBasicDetailResponse(SUCCESS, message, userBasicDetailDTO);
	}

	public static UserBasicDetailResponse notFound() {
		return new UserBasicDetailResponse(NOT_FOUND, null, null);
	}

	public static UserBasicDetailResponse notFound(String message) {
		return new UserBasicDetailResponse(NOT_FOUND, message, null);
	}

	public static UserBasicDetailResponse notFound(String responseCode, String message) {
		return new UserBasicDetailResponse(responseCode, message, null);
	}

	public static UserBasicDetailResponse internalError() {
		return new UserBasicDetailResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static UserBasicDetailResponse internalError(String message) {
		return new UserBasicDetailResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static UserBasicDetailResponse internalError(String responseCode, String message) {
		return new UserBasicDetailResponse(responseCode, message, null);
	}
}
