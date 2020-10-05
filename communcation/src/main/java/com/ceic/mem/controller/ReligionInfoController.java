package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.ReligionInfoResponse;
import com.ciec.mem.dto.ReligionInfoDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IReligionInfoManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class ReligionInfoController {
	private static final Logger LOG = LoggerFactory.getLogger(ReligionInfoController.class);

	@Autowired
	private IReligionInfoManager iReligionInfoManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ReligionInfoResponse addOrUpdateReligionInfo(@RequestBody ReligionInfoDTO religionInfoDTO) {
		try {
			religionInfoDTO = iReligionInfoManager.persistOrMerge(religionInfoDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + religionInfoDTO.getUserId());
			return ReligionInfoResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + religionInfoDTO.getUserId());
			return ReligionInfoResponse.internalError(e.getMessage());
		}
		return ReligionInfoResponse.success(religionInfoDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public ReligionInfoResponse fetchReligionInfoByUserId(@RequestBody String userId) {
		ReligionInfoDTO religionInfoDTO = new ReligionInfoDTO();

		try {
			religionInfoDTO = iReligionInfoManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return ReligionInfoResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return ReligionInfoResponse.internalError(e.getMessage());
		}
		return ReligionInfoResponse.success(religionInfoDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ReligionInfoResponse deleteReligionInfoByUserId(@RequestBody String userId) {

		try {
			iReligionInfoManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return ReligionInfoResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return ReligionInfoResponse.internalError(e.getMessage());
		}
		return ReligionInfoResponse.success(new ReligionInfoDTO());
	}
}
