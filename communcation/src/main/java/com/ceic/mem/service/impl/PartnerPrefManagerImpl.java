package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IPartnerPrefRepository;
import com.ciec.mem.dto.PartnerPrefDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IPartnerPrefManager;

@Service
public class PartnerPrefManagerImpl implements IPartnerPrefManager {

	private static final Logger LOG = LoggerFactory.getLogger(PartnerPrefManagerImpl.class);

	@Autowired
	private IPartnerPrefRepository iPartnerPrefRepository;

	@Transactional
	public PartnerPrefDTO persistOrMerge(PartnerPrefDTO partnerPrefDTO) throws MatrimonyException {
		LOG.debug("Partner Preferences dto before Persis/Merge: \n" + partnerPrefDTO.toString());
		
		try {
			partnerPrefDTO = EntityToDto.getPartnerPrefDTO(
					iPartnerPrefRepository.save(DtoToEntity.getPartnerPrefEntity(partnerPrefDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge Partner preferences", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return partnerPrefDTO;
	}

	@Override
	public PartnerPrefDTO findByUserId(String userId) throws MatrimonyException {
		PartnerPrefDTO partnerPrefDTO = new PartnerPrefDTO();
		
		try {
			partnerPrefDTO = EntityToDto.getPartnerPrefDTO(iPartnerPrefRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find Partner preferences for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("Partner Preferences findByUserId \n:" + partnerPrefDTO);
		return partnerPrefDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("partner Preferences ready to delete for userId :" + userId);
		
		try {
			return iPartnerPrefRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete partner Preferences", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
