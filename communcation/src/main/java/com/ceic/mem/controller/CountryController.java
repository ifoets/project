package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.CountryResponse;
import com.ceic.mem.model.external.EmployeeResponse;
import com.ciec.mem.dto.CountryDTO;
import com.ciec.mem.dto.EmployeeDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.ICountryManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class CountryController {
	private static final Logger LOG = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private ICountryManager iCountryManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public CountryResponse addOrUpdateCountry(@RequestBody CountryDTO countryDTO) {
		try {
			countryDTO = iCountryManager.persistOrMerge(countryDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for country code : " + countryDTO.getCountryCode());
			return CountryResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for country code : " + countryDTO.getCountryCode());
			return CountryResponse.internalError(e.getMessage());
		}
		return CountryResponse.success(countryDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public CountryResponse fetchCountryByCountryCode(@RequestBody Integer countryCode) {
		CountryDTO countryDTO = new CountryDTO();

		try {
			countryDTO = iCountryManager.findByCountryCode(countryCode);
		} catch (MatrimonyException e) {
			LOG.error(e + " for country code: " + countryCode);
			return CountryResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for country code:" + countryCode);
			return CountryResponse.internalError(e.getMessage());
		}
		return CountryResponse.success(countryDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public CountryResponse deleteCountryByCountryCode(@RequestBody Integer countryCode) {

		try {
			iCountryManager.deleteByCountryCode(countryCode);
		} catch (MatrimonyException e) {
			LOG.error(e + " for country code :" + countryCode);
			return CountryResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for country code :" + countryCode);
			return CountryResponse.internalError(e.getMessage());
		}
		return CountryResponse.success(new CountryDTO());
	}
}
