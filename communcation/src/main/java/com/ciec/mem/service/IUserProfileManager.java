package com.ciec.mem.service;

import com.ciec.mem.dto.UserProfileDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IUserProfileManager {

	UserProfileDTO persistOrMerge(UserProfileDTO userProfile) throws MatrimonyException;

	UserProfileDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
