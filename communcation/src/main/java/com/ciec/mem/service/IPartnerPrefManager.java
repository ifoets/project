package com.ciec.mem.service;

import com.ciec.mem.dto.PartnerPrefDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IPartnerPrefManager {

	PartnerPrefDTO persistOrMerge(PartnerPrefDTO prfessionalPref) throws MatrimonyException;

	PartnerPrefDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
