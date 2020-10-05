package com.ciec.mem.service;

import com.ciec.mem.dto.UserRegistrationDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IUserRegistrationManager {

	UserRegistrationDTO persistOrMerge(UserRegistrationDTO userRegistration) throws MatrimonyException;

	UserRegistrationDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
