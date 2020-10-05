package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.UserProfileResponse;
import com.ciec.mem.dto.UserProfileDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserProfileManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class UserProfileController {
	private static final Logger LOG = LoggerFactory.getLogger(UserProfileController.class);

	@Autowired
	private IUserProfileManager iUserProfileManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public UserProfileResponse addOrUpdateUserProfile(@RequestBody UserProfileDTO userProfileDTO) {
		try {
			userProfileDTO = iUserProfileManager.persistOrMerge(userProfileDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userProfileDTO.getUserId());
			return UserProfileResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userProfileDTO.getUserId());
			return UserProfileResponse.internalError(e.getMessage());
		}
		return UserProfileResponse.success(userProfileDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public UserProfileResponse fetchUserProfileByUserId(@RequestBody String userId) {
		UserProfileDTO userProfileDTO = new UserProfileDTO();

		try {
			userProfileDTO = iUserProfileManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserProfileResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserProfileResponse.internalError(e.getMessage());
		}
		return UserProfileResponse.success(userProfileDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public UserProfileResponse deleteUserProfileByUserId(@RequestBody String userId) {

		try {
			iUserProfileManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserProfileResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserProfileResponse.internalError(e.getMessage());
		}
		return UserProfileResponse.success(new UserProfileDTO());
	}
}
