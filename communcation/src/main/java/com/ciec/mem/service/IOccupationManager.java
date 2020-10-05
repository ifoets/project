package com.ciec.mem.service;

import com.ciec.mem.dto.OccupationDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IOccupationManager {

	OccupationDTO persistOrMerge(OccupationDTO occupation) throws MatrimonyException;

	OccupationDTO findByOccupation(String occupation) throws MatrimonyException;

	Long deleteByOccupation(String occupation) throws MatrimonyException;
}
