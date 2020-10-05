package com.ciec.mem.service;

import com.ciec.mem.dto.EmployeeDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IEmployeeManager {

	EmployeeDTO persistOrMerge(EmployeeDTO employee) throws MatrimonyException;

	EmployeeDTO findByEmployee(String employee) throws MatrimonyException;

	Long deleteByEmployee(String employee) throws MatrimonyException;
}
