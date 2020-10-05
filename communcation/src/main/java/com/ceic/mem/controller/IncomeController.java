package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.IncomeResponse;
import com.ciec.mem.dto.IncomeDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IIncomeManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class IncomeController {
	private static final Logger LOG = LoggerFactory.getLogger(IncomeController.class);

	@Autowired
	private IIncomeManager iIncomeManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public IncomeResponse addOrUpdateIncome(@RequestBody IncomeDTO incomeDTO) {
		try {
			incomeDTO = iIncomeManager.persistOrMerge(incomeDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for income in year : " + incomeDTO.getYearly());
			return IncomeResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for income in year : " + incomeDTO.getYearly());
			return IncomeResponse.internalError(e.getMessage());
		}
		return IncomeResponse.success(incomeDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public IncomeResponse fetchIncomeByYearly(@RequestBody String yearly) {
		IncomeDTO incomeDTO = new IncomeDTO();

		try {
			incomeDTO = iIncomeManager.findByYearly(yearly);
		} catch (MatrimonyException e) {
			LOG.error(e + " for income in yearly: " + yearly);
			return IncomeResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for income in yearly:" + yearly);
			return IncomeResponse.internalError(e.getMessage());
		}
		return IncomeResponse.success(incomeDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public IncomeResponse deleteIncomeByYearly(@RequestBody String yearly) {

		try {
			iIncomeManager.deleteByYearly(yearly);
		} catch (MatrimonyException e) {
			LOG.error(e + " for income (yearly) :" + yearly);
			return IncomeResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for income(yearly) :" + yearly);
			return IncomeResponse.internalError(e.getMessage());
		}
		return IncomeResponse.success(new IncomeDTO());
	}
}
