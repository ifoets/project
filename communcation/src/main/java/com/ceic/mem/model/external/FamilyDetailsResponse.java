package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.FamilyDetailsDTO;

public class FamilyDetailsResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private FamilyDetailsDTO familyDetailsDTO;

	public FamilyDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyDetailsResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public FamilyDetailsResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public FamilyDetailsResponse(String responseCode, FamilyDetailsDTO familyDetailsDTO) {
		this(responseCode, null, familyDetailsDTO);
	}

	public FamilyDetailsResponse(String responseCode, String message, FamilyDetailsDTO familyDetailsDTO) {
		super(responseCode, message);
		this.setFamilyDetailsDTO(familyDetailsDTO);
	}

	public FamilyDetailsDTO getFamilyDetailsDTO() {
		return familyDetailsDTO;
	}

	public void setFamilyDetailsDTO(FamilyDetailsDTO familyDetailsDTO) {
		this.familyDetailsDTO = familyDetailsDTO;
	}

	public static FamilyDetailsResponse success(FamilyDetailsDTO familyDetailsDTO) {
		return new FamilyDetailsResponse(SUCCESS, null, familyDetailsDTO);
	}

	public static FamilyDetailsResponse success(String message, FamilyDetailsDTO familyDetailsDTO) {
		return new FamilyDetailsResponse(SUCCESS, message, familyDetailsDTO);
	}

	public static FamilyDetailsResponse notFound() {
		return new FamilyDetailsResponse(NOT_FOUND, null, null);
	}

	public static FamilyDetailsResponse notFound(String message) {
		return new FamilyDetailsResponse(NOT_FOUND, message, null);
	}

	public static FamilyDetailsResponse notFound(String responseCode, String message) {
		return new FamilyDetailsResponse(responseCode, message, null);
	}

	public static FamilyDetailsResponse internalError() {
		return new FamilyDetailsResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static FamilyDetailsResponse internalError(String message) {
		return new FamilyDetailsResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static FamilyDetailsResponse internalError(String responseCode, String message) {
		return new FamilyDetailsResponse(responseCode, message, null);
	}
}
