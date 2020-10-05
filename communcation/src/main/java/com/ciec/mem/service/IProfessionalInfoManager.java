package com.ciec.mem.service;

import com.ciec.mem.dto.ProfessionalInfoDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IProfessionalInfoManager {

	ProfessionalInfoDTO persistOrMerge(ProfessionalInfoDTO prfessionalInfo) throws MatrimonyException;

	ProfessionalInfoDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
