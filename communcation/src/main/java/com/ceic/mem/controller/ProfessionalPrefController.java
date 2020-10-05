package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.ProfessionalPrefResponse;
import com.ciec.mem.dto.ProfessionalPrefDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IProfessionalPrefManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class ProfessionalPrefController {
	private static final Logger LOG = LoggerFactory.getLogger(ProfessionalPrefController.class);

	@Autowired
	private IProfessionalPrefManager iProfessionalPrefManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ProfessionalPrefResponse addOrUpdateProfessionalPref(@RequestBody ProfessionalPrefDTO professionalPrefDTO) {
		try {
			professionalPrefDTO = iProfessionalPrefManager.persistOrMerge(professionalPrefDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + professionalPrefDTO.getUserId());
			return ProfessionalPrefResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + professionalPrefDTO.getUserId());
			return ProfessionalPrefResponse.internalError(e.getMessage());
		}
		return ProfessionalPrefResponse.success(professionalPrefDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public ProfessionalPrefResponse fetchProfessionalPrefByUserId(@RequestBody String userId) {
		ProfessionalPrefDTO professionalPrefDTO = new ProfessionalPrefDTO();

		try {
			professionalPrefDTO = iProfessionalPrefManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalPrefResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalPrefResponse.internalError(e.getMessage());
		}
		return ProfessionalPrefResponse.success(professionalPrefDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ProfessionalPrefResponse deleteProfessionalPrefByUserId(@RequestBody String userId) {

		try {
			iProfessionalPrefManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalPrefResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalPrefResponse.internalError(e.getMessage());
		}
		return ProfessionalPrefResponse.success(new ProfessionalPrefDTO());
	}
}
