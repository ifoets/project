package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.ICountryRepository;
import com.ciec.mem.dto.CountryDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.ICountryManager;

@Service
public class CountryManagerImpl implements ICountryManager {

	private static final Logger LOG = LoggerFactory.getLogger(CountryManagerImpl.class);

	@Autowired
	private ICountryRepository iCountryRepository;

	@Transactional
	public CountryDTO persistOrMerge(CountryDTO countryDTO) throws MatrimonyException {
		LOG.debug("Country dto before Persis/Merge: \n" + countryDTO.toString());

		try {
			countryDTO = EntityToDto
					.getCountryDTO(iCountryRepository.save(DtoToEntity.getCountryEntity(countryDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge Country", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return countryDTO;
	}

	@Override
	public CountryDTO findByCountryCode(Integer countryCode) throws MatrimonyException {
		CountryDTO countryDTO = new CountryDTO();

		try {
			countryDTO = EntityToDto.getCountryDTO(iCountryRepository.findByCountryCode(countryCode));
		} catch (PersistenceException e) {
			LOG.error("Unable to find Country for country code :" + countryDTO.getCountryCode(), e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("Country DTO by early \n:" + countryDTO);
		return countryDTO;
	}

	@Override
	public Long deleteByCountryCode(Integer countryCode) throws MatrimonyException {
		LOG.debug("Country ready to delete for country code :" + countryCode);

		try {
			return iCountryRepository.deleteByCountryCode(countryCode);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete country", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
