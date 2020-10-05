package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.ReligionInfoDTO;

public class ReligionInfoResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private ReligionInfoDTO religionInfoDTO;

	public ReligionInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReligionInfoResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public ReligionInfoResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public ReligionInfoResponse(String responseCode, ReligionInfoDTO religionInfoDTO) {
		this(responseCode, null, religionInfoDTO);
	}

	public ReligionInfoResponse(String responseCode, String message, ReligionInfoDTO religionInfoDTO) {
		super(responseCode, message);
		this.setReligionInfoDTO(religionInfoDTO);
	}

	public ReligionInfoDTO getReligionInfoDTO() {
		return religionInfoDTO;
	}

	public void setReligionInfoDTO(ReligionInfoDTO religionInfoDTO) {
		this.religionInfoDTO = religionInfoDTO;
	}

	public static ReligionInfoResponse success(ReligionInfoDTO religionInfoDTO) {
		return new ReligionInfoResponse(SUCCESS, null, religionInfoDTO);
	}

	public static ReligionInfoResponse success(String message, ReligionInfoDTO religionInfoDTO) {
		return new ReligionInfoResponse(SUCCESS, message, religionInfoDTO);
	}

	public static ReligionInfoResponse notFound() {
		return new ReligionInfoResponse(NOT_FOUND, null, null);
	}

	public static ReligionInfoResponse notFound(String message) {
		return new ReligionInfoResponse(NOT_FOUND, message, null);
	}

	public static ReligionInfoResponse notFound(String responseCode, String message) {
		return new ReligionInfoResponse(responseCode, message, null);
	}

	public static ReligionInfoResponse internalError() {
		return new ReligionInfoResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static ReligionInfoResponse internalError(String message) {
		return new ReligionInfoResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static ReligionInfoResponse internalError(String responseCode, String message) {
		return new ReligionInfoResponse(responseCode, message, null);
	}
}
