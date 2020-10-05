package com.ceic.mem.service.impl;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;
import com.ceic.mem.persistence.repository.IIncomeRepository;
import com.ciec.mem.dto.IncomeDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IIncomeManager;

@Service
public class IncomeManagerImpl implements IIncomeManager {

	private static final Logger LOG = LoggerFactory.getLogger(IncomeManagerImpl.class);

	@Autowired
	private IIncomeRepository iIncomeRepository;

	@Transactional
	public IncomeDTO persistOrMerge(IncomeDTO incomeDTO) throws MatrimonyException {
		LOG.debug("Income dto before Persis/Merge: \n" + incomeDTO.toString());

		try {
			incomeDTO = EntityToDto.getIncomeDTO(iIncomeRepository.save(DtoToEntity.getIncomeEntity(incomeDTO)));
		} catch (PersistenceException e) {
			LOG.error("Unable to create/merge income", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return incomeDTO;
	}

	@Override
	public IncomeDTO findByYearly(String income) throws MatrimonyException {
		IncomeDTO incomeDTO = new IncomeDTO();

		try {
			incomeDTO = EntityToDto.getIncomeDTO(iIncomeRepository.findByYearly(income));
		} catch (PersistenceException e) {
			LOG.error("Unable to find income for income(yearly) :" + income, e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		LOG.debug("Income DTO by early \n:" + incomeDTO);
		return incomeDTO;
	}

	@Override
	public Long deleteByYearly(String yearly) throws MatrimonyException {
		LOG.debug("Income ready to delete for income(yearly) :" + yearly);

		try {
			return iIncomeRepository.deleteByYearly(yearly);
		} catch (PersistenceException e) {
			LOG.error("Unable to delete income(yearly)", e);
			new MatrimonyException(e.getLocalizedMessage());
		}
		return null;
	}
}
