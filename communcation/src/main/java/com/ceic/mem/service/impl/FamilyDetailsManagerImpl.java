package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IFamilyDetailsRepository;
import com.ciec.mem.dto.FamilyDetailsDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IFamilyDetailsManager;

@Service
public class FamilyDetailsManagerImpl implements IFamilyDetailsManager {

	private static final Logger LOG = LoggerFactory.getLogger(FamilyDetailsManagerImpl.class);

	@Autowired
	private IFamilyDetailsRepository iFamilyDetailsRepository;

	@Transactional
	public FamilyDetailsDTO persistOrMerge(FamilyDetailsDTO familyDetailsDTO) throws MatrimonyException {
		LOG.debug("FamilyDetails dto before Persis/Merge: \n" + familyDetailsDTO.toString());

		try {
			familyDetailsDTO = EntityToDto.getFamilyDetailsDTO(
					iFamilyDetailsRepository.save(DtoToEntity.getFamilyDetailsEntity(familyDetailsDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge family details", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return familyDetailsDTO;
	}

	@Override
	public FamilyDetailsDTO findByUserId(String userId) throws MatrimonyException {
		FamilyDetailsDTO familyDetailsDTO = new FamilyDetailsDTO();

		try {
			familyDetailsDTO = EntityToDto.getFamilyDetailsDTO(iFamilyDetailsRepository.findByUserId(userId));
		} catch (PersistenceException e) {
			LOG.error("Unable to find Family Details :" + userId, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("FamilyDetailsDTO  \n:" + familyDetailsDTO);
		return familyDetailsDTO;
	}

	@Override
	public Long deleteByUserId(String userId) throws MatrimonyException {
		LOG.debug("Ready for delete Family details for user Id :" + userId);

		try {
			return iFamilyDetailsRepository.deleteByUserId(userId);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete Family details", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
