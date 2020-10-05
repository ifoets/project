package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.UserLoginResponse;
import com.ciec.mem.dto.UserLoginDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserLoginManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class UserLoginController {
	private static final Logger LOG = LoggerFactory.getLogger(UserLoginController.class);

	@Autowired
	private IUserLoginManager iUserLoginManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public UserLoginResponse addOrUpdateUserLogin(@RequestBody UserLoginDTO userLoginDTO) {
		try {
			userLoginDTO = iUserLoginManager.persistOrMerge(userLoginDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userLoginDTO.getUserId());
			return UserLoginResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + userLoginDTO.getUserId());
			return UserLoginResponse.internalError(e.getMessage());
		}
		return UserLoginResponse.success(userLoginDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public UserLoginResponse fetchUserLoginByUserId(@RequestBody String userId) {
		UserLoginDTO userLoginDTO = new UserLoginDTO();

		try {
			userLoginDTO = iUserLoginManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserLoginResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserLoginResponse.internalError(e.getMessage());
		}
		return UserLoginResponse.success(userLoginDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public UserLoginResponse deleteUserLoginByUserId(@RequestBody String userId) {

		try {
			iUserLoginManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserLoginResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserLoginResponse.internalError(e.getMessage());
		}
		return UserLoginResponse.success(new UserLoginDTO());
	}
}
