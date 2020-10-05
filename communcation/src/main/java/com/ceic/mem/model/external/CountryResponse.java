package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.CountryDTO;

public class CountryResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private CountryDTO countryDTO;

	public CountryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountryResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public CountryResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public CountryResponse(String responseCode, CountryDTO countryDTO) {
		this(responseCode, null, countryDTO);
	}

	public CountryResponse(String responseCode, String message, CountryDTO countryDTO) {
		super(responseCode, message);
		this.setCountryDTO(countryDTO);
	}

	public CountryDTO getCountryDTO() {
		return countryDTO;
	}

	public void setCountryDTO(CountryDTO countryDTO) {
		this.countryDTO = countryDTO;
	}

	public static CountryResponse success(CountryDTO countryDTO) {
		return new CountryResponse(SUCCESS, null, countryDTO);
	}

	public static CountryResponse success(String message, CountryDTO countryDTO) {
		return new CountryResponse(SUCCESS, message, countryDTO);
	}

	public static CountryResponse notFound() {
		return new CountryResponse(NOT_FOUND, null, null);
	}

	public static CountryResponse notFound(String message) {
		return new CountryResponse(NOT_FOUND, message, null);
	}

	public static CountryResponse notFound(String responseCode, String message) {
		return new CountryResponse(responseCode, message, null);
	}

	public static CountryResponse internalError() {
		return new CountryResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static CountryResponse internalError(String message) {
		return new CountryResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static CountryResponse internalError(String responseCode, String message) {
		return new CountryResponse(responseCode, message, null);
	}
}
