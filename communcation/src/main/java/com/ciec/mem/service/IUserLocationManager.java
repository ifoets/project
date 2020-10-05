package com.ciec.mem.service;

import com.ciec.mem.dto.UserLocationDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IUserLocationManager {

	UserLocationDTO persistOrMerge(UserLocationDTO userLocation) throws MatrimonyException;

	UserLocationDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
