package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IProfessionalInfoRepository;
import com.ciec.mem.dto.ProfessionalInfoDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IProfessionalInfoManager;

@Service
public class ProfessionalInfoManagerImpl implements IProfessionalInfoManager {

	private static final Logger LOG = LoggerFactory.getLogger(ProfessionalInfoManagerImpl.class);

	@Autowired
	private IProfessionalInfoRepository iProfessionalInfoRepository;

	@Transactional
	public ProfessionalInfoDTO persistOrMerge(ProfessionalInfoDTO professionalInfoDTO) throws MatrimonyException {

		LOG.debug("professional Information dto before Persis/Merge: \n" + professionalInfoDTO.toString());
		try {
			professionalInfoDTO = EntityToDto.getProfessionalInfoDTO(
					iProfessionalInfoRepository.save(DtoToEntity.getProfessionalInfoEntity(professionalInfoDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge Professinal Information", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return professionalInfoDTO;
	}

	@Override
	public ProfessionalInfoDTO findByUserId(String userId) throws MatrimonyException {

		ProfessionalInfoDTO professionalInfoDTO = new ProfessionalInfoDTO();
		try {
			professionalInfoDTO = EntityToDto.getProfessionalInfoDTO(iProfessionalInfoRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find Professinal Information for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("professional Information findByUserId \n:" + professionalInfoDTO);
		return professionalInfoDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("professional Information ready to delete for userId :" + userId);
		try {
			return iProfessionalInfoRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete professional Information", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
