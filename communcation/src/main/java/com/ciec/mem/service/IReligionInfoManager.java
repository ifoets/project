package com.ciec.mem.service;

import com.ciec.mem.dto.ReligionInfoDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IReligionInfoManager {

	ReligionInfoDTO persistOrMerge(ReligionInfoDTO religionInfo) throws MatrimonyException;

	ReligionInfoDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
