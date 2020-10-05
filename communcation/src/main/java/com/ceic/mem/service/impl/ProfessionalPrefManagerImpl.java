package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IProfessionalPrefRepository;
import com.ciec.mem.dto.ProfessionalPrefDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IProfessionalPrefManager;

@Service
public class ProfessionalPrefManagerImpl implements IProfessionalPrefManager {

	private static final Logger LOG = LoggerFactory.getLogger(ProfessionalPrefManagerImpl.class);

	@Autowired
	private IProfessionalPrefRepository iProfessionalPrefRepository;

	@Transactional
	public ProfessionalPrefDTO persistOrMerge(ProfessionalPrefDTO professionalPrefDTO) throws MatrimonyException {

		LOG.debug("professional Preferences dto before Persis/Merge: \n" + professionalPrefDTO.toString());
		try {
			professionalPrefDTO = EntityToDto.getProfessionalPrefDTO(
					iProfessionalPrefRepository.save(DtoToEntity.getProfessionalPrefEntity(professionalPrefDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge Professinal preferences", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return professionalPrefDTO;
	}

	@Override
	public ProfessionalPrefDTO findByUserId(String userId) throws MatrimonyException {

		ProfessionalPrefDTO professionalPrefDTO = new ProfessionalPrefDTO();
		try {
			professionalPrefDTO = EntityToDto.getProfessionalPrefDTO(iProfessionalPrefRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find Professinal preferences for userId :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("professional Preferences findByUserId \n:" + professionalPrefDTO);
		return professionalPrefDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("professional Preferences ready to delete for userId :" + userId);
		try {
			return iProfessionalPrefRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete professional Preferences", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
