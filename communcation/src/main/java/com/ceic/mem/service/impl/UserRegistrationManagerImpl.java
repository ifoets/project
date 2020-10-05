package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IUserRegistrationRepository;
import com.ciec.mem.dto.UserRegistrationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserRegistrationManager;

@Service
public class UserRegistrationManagerImpl implements IUserRegistrationManager {

	private static final Logger LOG = LoggerFactory.getLogger(UserRegistrationManagerImpl.class);

	@Autowired
	private IUserRegistrationRepository usterRegistrationRepository;

	@Transactional
	public UserRegistrationDTO persistOrMerge(UserRegistrationDTO userRegistrationDTO) throws MatrimonyException {

		LOG.debug("UserRegistration dto before Persis/Merge:" + userRegistrationDTO.toString());
		try {
			userRegistrationDTO = EntityToDto.getUserRegistrationDTO(
					usterRegistrationRepository.save(DtoToEntity.getUserRegistrationEntity(userRegistrationDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create user registration", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return userRegistrationDTO;
	}

	@Override
	public UserRegistrationDTO findByUserId(String userId) throws MatrimonyException {

		UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();
		try {
			userRegistrationDTO = EntityToDto.getUserRegistrationDTO(usterRegistrationRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find user registration for Id :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("UserRegistration findByUserId \n:" + userRegistrationDTO);
		return userRegistrationDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("UserRegistration ready to delete for userId :" + userId);
		try {
			return usterRegistrationRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete user registration", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
