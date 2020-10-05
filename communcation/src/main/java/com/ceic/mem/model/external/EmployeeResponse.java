package com.ceic.mem.model.external;

import static com.ceic.mem.constants.ResponseCodes.INTERNAL_SERVICE_ERROR;
import static com.ceic.mem.constants.ResponseCodes.NOT_FOUND;
import static com.ceic.mem.constants.ResponseCodes.SUCCESS;

import com.ciec.mem.dto.EmployeeDTO;

public class EmployeeResponse extends ServiceResponse {

	private static final long serialVersionUID = -3220109009833366967L;
	private EmployeeDTO employeeDTO;

	public EmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeResponse(String responseCode) {
		this(responseCode, null, null);
	}

	public EmployeeResponse(String responseCode, String message) {
		this(responseCode, message, null);
	}

	public EmployeeResponse(String responseCode, EmployeeDTO employeeDTO) {
		this(responseCode, null, employeeDTO);
	}

	public EmployeeResponse(String responseCode, String message,EmployeeDTO employeeDTO) {
		super(responseCode, message);
		this.setEmployeeDTO(employeeDTO);
	}

	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}

	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}

	public static EmployeeResponse success(EmployeeDTO employeeDTO) {
		return new EmployeeResponse(SUCCESS, null, employeeDTO);
	}

	public static EmployeeResponse success(String message, EmployeeDTO employeeDTO) {
		return new EmployeeResponse(SUCCESS, message, employeeDTO);
	}

	public static EmployeeResponse notFound() {
		return new EmployeeResponse(NOT_FOUND, null, null);
	}

	public static EmployeeResponse notFound(String message) {
		return new EmployeeResponse(NOT_FOUND, message, null);
	}

	public static EmployeeResponse notFound(String responseCode, String message) {
		return new EmployeeResponse(responseCode, message, null);
	}

	public static EmployeeResponse internalError() {
		return new EmployeeResponse(INTERNAL_SERVICE_ERROR, null, null);
	}

	public static EmployeeResponse internalError(String message) {
		return new EmployeeResponse(INTERNAL_SERVICE_ERROR, message, null);
	}

	public static EmployeeResponse internalError(String responseCode, String message) {
		return new EmployeeResponse(responseCode, message, null);
	}
}
