package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.EmployeeResponse;
import com.ciec.mem.dto.EmployeeDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IEmployeeManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class EmployeeController {
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private IEmployeeManager iEmployeeManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public EmployeeResponse addOrUpdateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		try {
			employeeDTO = iEmployeeManager.persistOrMerge(employeeDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for employee : " + employeeDTO.getEmployee());
			return EmployeeResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for employee : " + employeeDTO.getEmployee());
			return EmployeeResponse.internalError(e.getMessage());
		}
		return EmployeeResponse.success(employeeDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public EmployeeResponse fetchIncomeByEmployee(@RequestBody String employee) {
		EmployeeDTO employeeDTO = new EmployeeDTO();

		try {
			employeeDTO = iEmployeeManager.findByEmployee(employee);
		} catch (MatrimonyException e) {
			LOG.error(e + " for employee: " + employee);
			return EmployeeResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for employee:" + employee);
			return EmployeeResponse.internalError(e.getMessage());
		}
		return EmployeeResponse.success(employeeDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public EmployeeResponse deleteIncomeByEmployee(@RequestBody String employee) {

		try {
			iEmployeeManager.deleteByEmployee(employee);
		} catch (MatrimonyException e) {
			LOG.error(e + " for employee :" + employee);
			return EmployeeResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for employee :" + employee);
			return EmployeeResponse.internalError(e.getMessage());
		}
		return EmployeeResponse.success(new EmployeeDTO());
	}
}
