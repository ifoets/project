package com.ciec.mem.service;

import com.ciec.mem.dto.CountryDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface ICountryManager {

	CountryDTO persistOrMerge(CountryDTO country) throws MatrimonyException;

	CountryDTO findByCountryCode(Integer countryCode) throws MatrimonyException;

	Long deleteByCountryCode(Integer countryCode) throws MatrimonyException;
}
