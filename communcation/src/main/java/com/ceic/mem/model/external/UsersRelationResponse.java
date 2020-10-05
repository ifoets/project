package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.UsersRelationDTO;

public class UsersRelationResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220419009833366983L;
	private UsersRelationDTO usersRelationDTO;

	public UsersRelationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersRelationResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public UsersRelationResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public UsersRelationResponse(String responseCode, UsersRelationDTO usersRelationDTO) {
		this(responseCode, null, usersRelationDTO);
	}

	public UsersRelationResponse(String responseCode, String message, UsersRelationDTO usersRelationDTO) {
		super(responseCode, message);
		this.setUsersRelationDTO(usersRelationDTO);
	}

	public UsersRelationDTO getUsersRelationDTO() {
		return usersRelationDTO;
	}

	public void setUsersRelationDTO(UsersRelationDTO usersRelationDTO) {
		this.usersRelationDTO = usersRelationDTO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static UsersRelationResponse success(UsersRelationDTO usersRelationDTO) {
		return new UsersRelationResponse(SUCCESS, null, usersRelationDTO);
	}

	public static UsersRelationResponse success(String message, UsersRelationDTO usersRelationDTO) {
		return new UsersRelationResponse(SUCCESS, message, usersRelationDTO);
	}

	public static UsersRelationResponse notFound() {
		return new UsersRelationResponse(NOT_FOUND, null, null);
	}

	public static UsersRelationResponse notFound(String message) {
		return new UsersRelationResponse(NOT_FOUND, message, null);
	}

	public static UsersRelationResponse notFound(String responseCode, String message) {
		return new UsersRelationResponse(responseCode, message, null);
	}

	public static UsersRelationResponse internalError() {
		return new UsersRelationResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static UsersRelationResponse internalError(String message) {
		return new UsersRelationResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static UsersRelationResponse internalError(String responseCode, String message) {
		return new UsersRelationResponse(responseCode, message, null);
	}
}
