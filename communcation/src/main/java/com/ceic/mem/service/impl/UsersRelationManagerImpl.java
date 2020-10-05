package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IUsersRelationRepository;
import com.ciec.mem.dto.UsersRelationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUsersRelationManager;

@Service
public class UsersRelationManagerImpl implements IUsersRelationManager {

	private static final Logger LOG = LoggerFactory.getLogger(UsersRelationManagerImpl.class);

	@Autowired
	private IUsersRelationRepository iUsersRelationRepository;

	@Transactional
	public UsersRelationDTO persistOrMerge(UsersRelationDTO usersRelationDTO) throws MatrimonyException {

		LOG.debug("UserRelation dto before Persis/Merge:" + usersRelationDTO.toString());
		try {
			usersRelationDTO = EntityToDto.getUsersRelationDTO(
					iUsersRelationRepository.save(DtoToEntity.getUsersRelationEntity(usersRelationDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge user relation", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return usersRelationDTO;
	}

	@Override
	public UsersRelationDTO findByUserId(String userId) throws MatrimonyException {

		UsersRelationDTO usersRelationDTO = new UsersRelationDTO();
		try {
			usersRelationDTO = EntityToDto.getUsersRelationDTO(iUsersRelationRepository.findByFromUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find users relation for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("UserRelation findByUserId \n:" + usersRelationDTO);
		return usersRelationDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("UserRelation ready to delete for userId :" + userId);
		try {
			return iUsersRelationRepository.deleteByFromUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete users relation", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
