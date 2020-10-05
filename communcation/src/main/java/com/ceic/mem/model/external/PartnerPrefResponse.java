package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.PartnerPrefDTO;

public class PartnerPrefResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private PartnerPrefDTO PartnerPrefDTO;

	public PartnerPrefResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartnerPrefResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public PartnerPrefResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public PartnerPrefResponse(String responseCode, PartnerPrefDTO PartnerPrefDTO) {
		this(responseCode, null, PartnerPrefDTO);
	}

	public PartnerPrefResponse(String responseCode, String message, PartnerPrefDTO PartnerPrefDTO) {
		super(responseCode, message);
		this.setPartnerPrefDTO(PartnerPrefDTO);
	}

	public PartnerPrefDTO getPartnerPrefDTO() {
		return PartnerPrefDTO;
	}

	public void setPartnerPrefDTO(PartnerPrefDTO partnerPrefDTO) {
		PartnerPrefDTO = partnerPrefDTO;
	}

	public static PartnerPrefResponse success(PartnerPrefDTO PartnerPrefDTO) {
		return new PartnerPrefResponse(SUCCESS, null, PartnerPrefDTO);
	}

	public static PartnerPrefResponse success(String message, PartnerPrefDTO PartnerPrefDTO) {
		return new PartnerPrefResponse(SUCCESS, message, PartnerPrefDTO);
	}

	public static PartnerPrefResponse notFound() {
		return new PartnerPrefResponse(NOT_FOUND, null, null);
	}

	public static PartnerPrefResponse notFound(String message) {
		return new PartnerPrefResponse(NOT_FOUND, message, null);
	}

	public static PartnerPrefResponse notFound(String responseCode, String message) {
		return new PartnerPrefResponse(responseCode, message, null);
	}

	public static PartnerPrefResponse internalError() {
		return new PartnerPrefResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static PartnerPrefResponse internalError(String message) {
		return new PartnerPrefResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static PartnerPrefResponse internalError(String responseCode, String message) {
		return new PartnerPrefResponse(responseCode, message, null);
	}
}
