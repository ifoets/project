package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IUserLocationRepository;
import com.ciec.mem.dto.UserLocationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserLocationManager;

@Service
public class UserLocationManagerImpl implements IUserLocationManager {

	private static final Logger LOG = LoggerFactory.getLogger(UserLocationManagerImpl.class);

	@Autowired
	private IUserLocationRepository iUserLocationRepository;

	@Transactional
	public UserLocationDTO persistOrMerge(UserLocationDTO userLocationDTO) throws MatrimonyException {

		LOG.debug("UserLocation dto before Persis/Merge: \n" + userLocationDTO.toString());
		try {
			userLocationDTO = EntityToDto.getUserLocationDTO(
					iUserLocationRepository.save(DtoToEntity.getUserLocationEntity(userLocationDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge user location", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return userLocationDTO;
	}

	@Override
	public UserLocationDTO findByUserId(String userId) throws MatrimonyException {

		UserLocationDTO userLocationDTO = new UserLocationDTO();
		try {
			userLocationDTO = EntityToDto.getUserLocationDTO(iUserLocationRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find users location for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("UserProfile findByUserId \n:" + userLocationDTO);
		return userLocationDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("UserLocation ready to delete for userId :" + userId);
		try {
			return iUserLocationRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete users location", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
