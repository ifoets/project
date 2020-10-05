package com.ciec.mem.service;

import com.ciec.mem.dto.UserLoginDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IUserLoginManager {

	UserLoginDTO persistOrMerge(UserLoginDTO userLogin) throws MatrimonyException;

	UserLoginDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
