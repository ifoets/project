package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IUserBasicDetailRepository;
import com.ciec.mem.dto.UserBasicDetailDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserBasicDetailManager;

@Service
public class UserBasicDetailManagerImpl implements IUserBasicDetailManager {

	private static final Logger LOG = LoggerFactory.getLogger(UserBasicDetailManagerImpl.class);

	@Autowired
	private IUserBasicDetailRepository iUserBasicDetailRepository;

	@Transactional
	public UserBasicDetailDTO persistOrMerge(UserBasicDetailDTO userBasicDetailDTO) throws MatrimonyException {

		LOG.debug("UserBasicDetail dto before Persis/Merge: \n" + userBasicDetailDTO.toString());
		try {
			userBasicDetailDTO = EntityToDto.getUserBasicDetailDTO(
					iUserBasicDetailRepository.save(DtoToEntity.getUserBasicDetailEntity(userBasicDetailDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge user basic detail", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return userBasicDetailDTO;
	}

	@Override
	public UserBasicDetailDTO findByUserId(String userId) throws MatrimonyException {

		UserBasicDetailDTO userBasicDetailDTO = new UserBasicDetailDTO();
		try {
			userBasicDetailDTO = EntityToDto.getUserBasicDetailDTO(iUserBasicDetailRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find users basic detail or userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("UserProfile findByUserId \n:" + userBasicDetailDTO);
		return userBasicDetailDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("UserLogin ready to delete for userId :" + userId);
		try {
			return iUserBasicDetailRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete users basic detail", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
