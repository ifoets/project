package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IReligionInfoRepository;
import com.ciec.mem.dto.ReligionInfoDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IReligionInfoManager;

@Service
public class ReligionInfoManagerImpl implements IReligionInfoManager {

	private static final Logger LOG = LoggerFactory.getLogger(ReligionInfoManagerImpl.class);

	@Autowired
	private IReligionInfoRepository iReligionInfoRepository;

	@Transactional
	public ReligionInfoDTO persistOrMerge(ReligionInfoDTO religionInfoDTO) throws MatrimonyException {

		LOG.debug("ReligionInfo dto before Persis/Merge: \n" + religionInfoDTO.toString());
		try {
			religionInfoDTO = EntityToDto
					.getReligionInfoDTO(iReligionInfoRepository.save(DtoToEntity.getReligionInfoEntity(religionInfoDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge Religion information", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return religionInfoDTO;
	}

	@Override
	public ReligionInfoDTO findByUserId(String userId) throws MatrimonyException {

		ReligionInfoDTO religionInfoDTO = new ReligionInfoDTO();
		try {
			religionInfoDTO = EntityToDto.getReligionInfoDTO(iReligionInfoRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find Religion Information for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("ReligionInfo findByUserId \n:" + religionInfoDTO);
		return religionInfoDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("ReligionInfo ready to delete for userId :" + userId);
		try {
			return iReligionInfoRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete Religion Information", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
