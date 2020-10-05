package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IOccupationRepository;
import com.ciec.mem.dto.OccupationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IOccupationManager;

@Service
public class OccupationManagerImpl implements IOccupationManager {

	private static final Logger LOG = LoggerFactory.getLogger(OccupationManagerImpl.class);

	@Autowired
	private IOccupationRepository iOccupationRepository;

	@Transactional
	public OccupationDTO persistOrMerge(OccupationDTO occupationDTO) throws MatrimonyException {
		LOG.debug("Occupation dto before Persis/Merge: \n" + occupationDTO.toString());

		try {
			occupationDTO = EntityToDto
					.getOccupationDTO(iOccupationRepository.save(DtoToEntity.getOccupationEntity(occupationDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge occupation", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return occupationDTO;
	}

	@Override
	public OccupationDTO findByOccupation(String occupation) throws MatrimonyException {
		OccupationDTO occupationDTO = new OccupationDTO();

		try {
			occupationDTO = EntityToDto.getOccupationDTO(iOccupationRepository.findByOccupation(occupation));
		} catch (PersistenceException e) {
			LOG.error("Unable to find occupation for occupation :" + occupation, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("Partner Preferences findByUserId \n:" + occupationDTO);
		return occupationDTO;
	}

	@Override
	public Long deleteByOccupation(String occupation) throws MatrimonyException {
		LOG.debug("OccupationIn ready to delete for userId :" + occupation);

		try {
			return iOccupationRepository.deleteByOccupation(occupation);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete occupation", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
