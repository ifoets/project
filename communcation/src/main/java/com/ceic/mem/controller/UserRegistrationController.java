package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.UserRegistrationResponse;
import com.ciec.mem.dto.UserRegistrationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserRegistrationManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class UserRegistrationController {
	private static final Logger LOG = LoggerFactory.getLogger(UserRegistrationController.class);

	@Autowired
	private IUserRegistrationManager iUserRegistrationManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public UserRegistrationResponse addOrUpdateUserRegistration(@RequestBody UserRegistrationDTO userRegistrationDTO) {
		try {
			userRegistrationDTO = iUserRegistrationManager.persistOrMerge(userRegistrationDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userRegistrationDTO.getUserId());
			return UserRegistrationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userRegistrationDTO.getUserId());
			return UserRegistrationResponse.internalError(e.getMessage());
		}
		return UserRegistrationResponse.success(userRegistrationDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public UserRegistrationResponse fetchUserRegistrationByUserId(@RequestBody String userId) {
		UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();

		try {
			userRegistrationDTO = iUserRegistrationManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserRegistrationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserRegistrationResponse.internalError(e.getMessage());
		}
		return UserRegistrationResponse.success(userRegistrationDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public UserRegistrationResponse deleteUserRegistrationByUserId(@RequestBody String userId) {

		try {
			iUserRegistrationManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserRegistrationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserRegistrationResponse.internalError(e.getMessage());
		}
		return UserRegistrationResponse.success(new UserRegistrationDTO());
	}

}
