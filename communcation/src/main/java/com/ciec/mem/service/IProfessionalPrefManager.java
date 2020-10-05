package com.ciec.mem.service;

import com.ciec.mem.dto.ProfessionalPrefDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IProfessionalPrefManager {

	ProfessionalPrefDTO persistOrMerge(ProfessionalPrefDTO prfessionalPref) throws MatrimonyException;

	ProfessionalPrefDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
