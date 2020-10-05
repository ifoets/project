package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.OccupationDTO;

public class OccupationResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private OccupationDTO occupationDTO;

	public OccupationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OccupationResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public OccupationResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public OccupationResponse(String responseCode, OccupationDTO occupationDTO) {
		this(responseCode, null, occupationDTO);
	}

	public OccupationResponse(String responseCode, String message, OccupationDTO occupationDTO) {
		super(responseCode, message);
		this.setOccupationDTO(occupationDTO);
	}


	public OccupationDTO getOccupationDTO() {
		return occupationDTO;
	}

	public void setOccupationDTO(OccupationDTO occupationDTO) {
		this.occupationDTO = occupationDTO;
	}

	public static OccupationResponse success(OccupationDTO occupationDTO) {
		return new OccupationResponse(SUCCESS, null, occupationDTO);
	}

	public static OccupationResponse success(String message, OccupationDTO occupationDTO) {
		return new OccupationResponse(SUCCESS, message, occupationDTO);
	}

	public static OccupationResponse notFound() {
		return new OccupationResponse(NOT_FOUND, null, null);
	}

	public static OccupationResponse notFound(String message) {
		return new OccupationResponse(NOT_FOUND, message, null);
	}

	public static OccupationResponse notFound(String responseCode, String message) {
		return new OccupationResponse(responseCode, message, null);
	}

	public static OccupationResponse internalError() {
		return new OccupationResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static OccupationResponse internalError(String message) {
		return new OccupationResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static OccupationResponse internalError(String responseCode, String message) {
		return new OccupationResponse(responseCode, message, null);
	}
}
