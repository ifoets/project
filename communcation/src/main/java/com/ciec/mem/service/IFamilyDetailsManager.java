package com.ciec.mem.service;

import com.ciec.mem.dto.FamilyDetailsDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IFamilyDetailsManager {

	FamilyDetailsDTO persistOrMerge(FamilyDetailsDTO familyDetails) throws MatrimonyException;

	FamilyDetailsDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
