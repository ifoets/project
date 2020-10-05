package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.IncomeDTO;

public class IncomeResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private IncomeDTO incomeDTO;

	public IncomeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IncomeResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public IncomeResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public IncomeResponse(String responseCode, IncomeDTO incomeDTO) {
		this(responseCode, null, incomeDTO);
	}

	public IncomeResponse(String responseCode, String message, IncomeDTO incomeDTO) {
		super(responseCode, message);
		this.setIncomeDTO(incomeDTO);
	}

	public IncomeDTO getIncomeDTO() {
		return incomeDTO;
	}

	public void setIncomeDTO(IncomeDTO incomeDTO) {
		this.incomeDTO = incomeDTO;
	}

	public static IncomeResponse success(IncomeDTO incomeDTO) {
		return new IncomeResponse(SUCCESS, null, incomeDTO);
	}

	public static IncomeResponse success(String message, IncomeDTO incomeDTO) {
		return new IncomeResponse(SUCCESS, message, incomeDTO);
	}

	public static IncomeResponse notFound() {
		return new IncomeResponse(NOT_FOUND, null, null);
	}

	public static IncomeResponse notFound(String message) {
		return new IncomeResponse(NOT_FOUND, message, null);
	}

	public static IncomeResponse notFound(String responseCode, String message) {
		return new IncomeResponse(responseCode, message, null);
	}

	public static IncomeResponse internalError() {
		return new IncomeResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static IncomeResponse internalError(String message) {
		return new IncomeResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static IncomeResponse internalError(String responseCode, String message) {
		return new IncomeResponse(responseCode, message, null);
	}
}
