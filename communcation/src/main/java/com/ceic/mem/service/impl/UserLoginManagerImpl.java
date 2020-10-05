package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IUserLoginRepository;
import com.ciec.mem.dto.UserLoginDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserLoginManager;

@Service
public class UserLoginManagerImpl implements IUserLoginManager {

	private static final Logger LOG = LoggerFactory.getLogger(UserLoginManagerImpl.class);

	@Autowired
	private IUserLoginRepository iUserLoginRepository;

	@Transactional
	public UserLoginDTO persistOrMerge(UserLoginDTO userLoginDTO) throws MatrimonyException {

		LOG.debug("UserLogin dto before Persis/Merge: \n" + userLoginDTO.toString());
		try {
			userLoginDTO = EntityToDto
					.getUserLoginDTO(iUserLoginRepository.save(DtoToEntity.getUserLoginEntity(userLoginDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge user login", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return userLoginDTO;
	}

	@Override
	public UserLoginDTO findByUserId(String userId) throws MatrimonyException {

		UserLoginDTO userLoginDTO = new UserLoginDTO();
		try {
			userLoginDTO = EntityToDto.getUserLoginDTO(iUserLoginRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find users login for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("UserLogin findByUserId \n:" + userLoginDTO);
		return userLoginDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("UserLogin ready to delete for userId :" + userId);
		try {
			return iUserLoginRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete user login", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
