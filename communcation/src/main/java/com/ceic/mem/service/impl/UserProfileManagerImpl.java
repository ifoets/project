package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IUsersProfileRepository;
import com.ciec.mem.dto.UserProfileDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserProfileManager;

@Service
public class UserProfileManagerImpl implements IUserProfileManager {

	private static final Logger LOG = LoggerFactory.getLogger(UserProfileManagerImpl.class);

	@Autowired
	private IUsersProfileRepository iUsersProfileRepository;

	@Transactional
	public UserProfileDTO persistOrMerge(UserProfileDTO userProfileDTO) throws MatrimonyException {

		LOG.debug("UserProfile dto before Persis/Merge: \n" + userProfileDTO.toString());
		try {
			userProfileDTO = EntityToDto
					.getUserProfileDTO(iUsersProfileRepository.save(DtoToEntity.getUserProfileEntity(userProfileDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge user profile", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return userProfileDTO;
	}

	@Override
	public UserProfileDTO findByUserId(String userId) throws MatrimonyException {

		UserProfileDTO userProfileDTO = new UserProfileDTO();
		try {
			userProfileDTO = EntityToDto.getUserProfileDTO(iUsersProfileRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find users relation for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("UserProfile findByUserId \n:" + userProfileDTO);
		return userProfileDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("UserRelation ready to delete for userId :" + userId);
		try {
			return iUsersProfileRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete users pfofile", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
