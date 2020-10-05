package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IEmployeeRepository;
import com.ciec.mem.dto.EmployeeDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IEmployeeManager;

@Service
public class EmployeeManagerImpl implements IEmployeeManager {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeManagerImpl.class);

	@Autowired
	private IEmployeeRepository iEmployeeRepository;

	@Transactional
	public EmployeeDTO persistOrMerge(EmployeeDTO employeeDTO) throws MatrimonyException {
		LOG.debug("Employee dto before Persis/Merge: \n" + employeeDTO.toString());

		try {
			employeeDTO = EntityToDto
					.getEmployeeDTO(iEmployeeRepository.save(DtoToEntity.getEmployeeEntity(employeeDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge Employee", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return employeeDTO;
	}

	@Override
	public EmployeeDTO findByEmployee(String employee) throws MatrimonyException {
		EmployeeDTO employeeDTO = new EmployeeDTO();

		try {
			employeeDTO = EntityToDto.getEmployeeDTO(iEmployeeRepository.findByEmployee(employee));
		} catch (PersistenceException e) {
			LOG.error("Unable to find Employee for employee :" + employee, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("Employee DTO by early \n:" + employeeDTO);
		return employeeDTO;
	}

	@Override
	public Long deleteByEmployee(String employee) throws MatrimonyException {
		LOG.debug("Employee ready to delete for employee :" + employee);

		try {
			return iEmployeeRepository.deleteByEmployee(employee);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete income(yearly)", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
