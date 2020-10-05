package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.ProfessionalPrefDTO;

public class ProfessionalPrefResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private ProfessionalPrefDTO professionalPrefDTO;

	public ProfessionalPrefResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessionalPrefResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public ProfessionalPrefResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public ProfessionalPrefResponse(String responseCode, ProfessionalPrefDTO professionalPrefDTO) {
		this(responseCode, null, professionalPrefDTO);
	}

	public ProfessionalPrefResponse(String responseCode, String message, ProfessionalPrefDTO professionalPrefDTO) {
		super(responseCode, message);
		this.setProfessionalPrefDTO(professionalPrefDTO);
	}

	public ProfessionalPrefDTO getProfessionalPrefDTO() {
		return professionalPrefDTO;
	}

	public void setProfessionalPrefDTO(ProfessionalPrefDTO professionalPrefDTO) {
		this.professionalPrefDTO = professionalPrefDTO;
	}

	public static ProfessionalPrefResponse success(ProfessionalPrefDTO professionalPrefDTO) {
		return new ProfessionalPrefResponse(SUCCESS, null, professionalPrefDTO);
	}

	public static ProfessionalPrefResponse success(String message, ProfessionalPrefDTO professionalPrefDTO) {
		return new ProfessionalPrefResponse(SUCCESS, message, professionalPrefDTO);
	}

	public static ProfessionalPrefResponse notFound() {
		return new ProfessionalPrefResponse(NOT_FOUND, null, null);
	}

	public static ProfessionalPrefResponse notFound(String message) {
		return new ProfessionalPrefResponse(NOT_FOUND, message, null);
	}

	public static ProfessionalPrefResponse notFound(String responseCode, String message) {
		return new ProfessionalPrefResponse(responseCode, message, null);
	}

	public static ProfessionalPrefResponse internalError() {
		return new ProfessionalPrefResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static ProfessionalPrefResponse internalError(String message) {
		return new ProfessionalPrefResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static ProfessionalPrefResponse internalError(String responseCode, String message) {
		return new ProfessionalPrefResponse(responseCode, message, null);
	}
}
