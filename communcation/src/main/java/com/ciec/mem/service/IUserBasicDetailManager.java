package com.ciec.mem.service;

import com.ciec.mem.dto.UserBasicDetailDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IUserBasicDetailManager {

	UserBasicDetailDTO persistOrMerge(UserBasicDetailDTO userBasicDetail) throws MatrimonyException;

	UserBasicDetailDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
