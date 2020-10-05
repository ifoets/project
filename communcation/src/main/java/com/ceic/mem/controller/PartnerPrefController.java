package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.PartnerPrefResponse;
import com.ciec.mem.dto.PartnerPrefDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IPartnerPrefManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class PartnerPrefController {
	private static final Logger LOG = LoggerFactory.getLogger(PartnerPrefController.class);

	@Autowired
	private IPartnerPrefManager iPartnerPrefManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public PartnerPrefResponse addOrUpdatePartnerPref(@RequestBody PartnerPrefDTO partnerPrefDTO) {
		try {
			partnerPrefDTO = iPartnerPrefManager.persistOrMerge(partnerPrefDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + partnerPrefDTO.getUserId());
			return PartnerPrefResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + partnerPrefDTO.getUserId());
			return PartnerPrefResponse.internalError(e.getMessage());
		}
		return PartnerPrefResponse.success(partnerPrefDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public PartnerPrefResponse fetchPartnerPrefByUserId(@RequestBody String userId) {
		PartnerPrefDTO PartnerPrefDTO = new PartnerPrefDTO();

		try {
			PartnerPrefDTO = iPartnerPrefManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return PartnerPrefResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return PartnerPrefResponse.internalError(e.getMessage());
		}
		return PartnerPrefResponse.success(PartnerPrefDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public PartnerPrefResponse deletePartnerPrefByUserId(@RequestBody String userId) {

		try {
			iPartnerPrefManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return PartnerPrefResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return PartnerPrefResponse.internalError(e.getMessage());
		}
		return PartnerPrefResponse.success(new PartnerPrefDTO());
	}
}
