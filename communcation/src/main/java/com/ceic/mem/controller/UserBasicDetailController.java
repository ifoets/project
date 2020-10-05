package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.UserBasicDetailResponse;
import com.ciec.mem.dto.UserBasicDetailDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUserBasicDetailManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class UserBasicDetailController {
	private static final Logger LOG = LoggerFactory.getLogger(UserBasicDetailController.class);

	@Autowired
	private IUserBasicDetailManager iUserBasicDetailManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public UserBasicDetailResponse addOrUpdateUserBasicDetail(@RequestBody UserBasicDetailDTO userBasicDetailDTO) {
		try {
			userBasicDetailDTO = iUserBasicDetailManager.persistOrMerge(userBasicDetailDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId: " + userBasicDetailDTO.getUserId());
			return UserBasicDetailResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + userBasicDetailDTO.getUserId());
			return UserBasicDetailResponse.internalError(e.getMessage());
		}
		return UserBasicDetailResponse.success(userBasicDetailDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public UserBasicDetailResponse fetchUserBasicDetailByUserId(@RequestBody String userId) {
		UserBasicDetailDTO userBasicDetailDTO = new UserBasicDetailDTO();

		try {
			userBasicDetailDTO = iUserBasicDetailManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserBasicDetailResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserBasicDetailResponse.internalError(e.getMessage());
		}
		return UserBasicDetailResponse.success(userBasicDetailDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public UserBasicDetailResponse deleteUserBasicDetailByUserId(@RequestBody String userId) {

		try {
			iUserBasicDetailManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UserBasicDetailResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UserBasicDetailResponse.internalError(e.getMessage());
		}
		return UserBasicDetailResponse.success(new UserBasicDetailDTO());
	}
}
