package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.UserLocationResponse;
import com.ciec.mem.dto.UserLocationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserLocationManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class UserLocationController {
	private static final Logger LOG = LoggerFactory.getLogger(UserLocationController.class);

	@Autowired
	private IUserLocationManager iUserLocationManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public UserLocationResponse addOrUpdateUserLocation(@RequestBody UserLocationDTO userLocationDTO) {
		try {
			userLocationDTO = iUserLocationManager.persistOrMerge(userLocationDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId: " + userLocationDTO);
			return UserLocationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + userLocationDTO.getUserId());
			return UserLocationResponse.internalError(e.getMessage());
		}
		return UserLocationResponse.success(userLocationDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public UserLocationResponse fetchUserLocationByUserId(@RequestBody String userId) {
		UserLocationDTO userLocationDTO = new UserLocationDTO();

		try {
			userLocationDTO = iUserLocationManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserLocationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserLocationResponse.internalError(e.getMessage());
		}
		return UserLocationResponse.success(userLocationDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public UserLocationResponse deleteUserLocationByUserId(@RequestBody String userId) {

		try {
			iUserLocationManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserLocationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserLocationResponse.internalError(e.getMessage());
		}
		return UserLocationResponse.success(new UserLocationDTO());
	}
}
