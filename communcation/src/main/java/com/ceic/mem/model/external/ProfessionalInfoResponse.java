package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.ProfessionalInfoDTO;

public class ProfessionalInfoResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private ProfessionalInfoDTO professionalInfoDTO;

	public ProfessionalInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessionalInfoResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public ProfessionalInfoResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public ProfessionalInfoResponse(String responseCode, ProfessionalInfoDTO professionalInfoDTO) {
		this(responseCode, null, professionalInfoDTO);
	}

	public ProfessionalInfoResponse(String responseCode, String message, ProfessionalInfoDTO professionalInfoDTO) {
		super(responseCode, message);
		this.setProfessionalInfoDTO(professionalInfoDTO);
	}

	public ProfessionalInfoDTO getProfessionalInfoDTO() {
		return professionalInfoDTO;
	}

	public void setProfessionalInfoDTO(ProfessionalInfoDTO professionalInfoDTO) {
		this.professionalInfoDTO = professionalInfoDTO;
	}

	public static ProfessionalInfoResponse success(ProfessionalInfoDTO professionalInfoDTO) {
		return new ProfessionalInfoResponse(SUCCESS, null, professionalInfoDTO);
	}

	public static ProfessionalInfoResponse success(String message, ProfessionalInfoDTO professionalInfoDTO) {
		return new ProfessionalInfoResponse(SUCCESS, message, professionalInfoDTO);
	}

	public static ProfessionalInfoResponse notFound() {
		return new ProfessionalInfoResponse(NOT_FOUND, null, null);
	}

	public static ProfessionalInfoResponse notFound(String message) {
		return new ProfessionalInfoResponse(NOT_FOUND, message, null);
	}

	public static ProfessionalInfoResponse notFound(String responseCode, String message) {
		return new ProfessionalInfoResponse(responseCode, message, null);
	}

	public static ProfessionalInfoResponse internalError() {
		return new ProfessionalInfoResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static ProfessionalInfoResponse internalError(String message) {
		return new ProfessionalInfoResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static ProfessionalInfoResponse internalError(String responseCode, String message) {
		return new ProfessionalInfoResponse(responseCode, message, null);
	}
}
