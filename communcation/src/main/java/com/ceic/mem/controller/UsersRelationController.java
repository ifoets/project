package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.UsersRelationResponse;
import com.ciec.mem.dto.UsersRelationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IUsersRelationManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class UsersRelationController {
	private static final Logger LOG = LoggerFactory.getLogger(UsersRelationController.class);

	@Autowired
	private IUsersRelationManager iUsersRelationManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public UsersRelationResponse addOrUpdateUsersRelation(@RequestBody UsersRelationDTO usersRelationDTO) {
		try {
			usersRelationDTO = iUsersRelationManager.persistOrMerge(usersRelationDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + usersRelationDTO.getFromUserId());
			return UsersRelationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + usersRelationDTO.getFromUserId());
			return UsersRelationResponse.internalError(e.getMessage());
		}
		return UsersRelationResponse.success(usersRelationDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public UsersRelationResponse fetchUsersRelationByUserId(@RequestBody String userId) {
		UsersRelationDTO usersRelationDTO = new UsersRelationDTO();

		try {
			usersRelationDTO = iUsersRelationManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UsersRelationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UsersRelationResponse.internalError(e.getMessage());
		}
		return UsersRelationResponse.success(usersRelationDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public UsersRelationResponse deleteUsersRelationByUserId(@RequestBody String userId) {

		try {
			iUsersRelationManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return UsersRelationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return UsersRelationResponse.internalError(e.getMessage());
		}
		return UsersRelationResponse.success(new UsersRelationDTO());
	}
}
