package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.ProfessionalInfoResponse;
import com.ciec.mem.dto.ProfessionalInfoDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IProfessionalInfoManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class ProfessionalInfoController {
	private static final Logger LOG = LoggerFactory.getLogger(ProfessionalInfoController.class);

	@Autowired
	private IProfessionalInfoManager iProfessionalInfoManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ProfessionalInfoResponse addOrUpdateProfessionalInfo(@RequestBody ProfessionalInfoDTO professionalInfoDTO) {
		try {
			professionalInfoDTO = iProfessionalInfoManager.persistOrMerge(professionalInfoDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + professionalInfoDTO.getUserId());
			return ProfessionalInfoResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + professionalInfoDTO.getUserId());
			return ProfessionalInfoResponse.internalError(e.getMessage());
		}
		return ProfessionalInfoResponse.success(professionalInfoDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public ProfessionalInfoResponse fetchProfessionalInfoByUserId(@RequestBody String userId) {
		ProfessionalInfoDTO professionalInfoDTO = new ProfessionalInfoDTO();

		try {
			professionalInfoDTO = iProfessionalInfoManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalInfoResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalInfoResponse.internalError(e.getMessage());
		}
		return ProfessionalInfoResponse.success(professionalInfoDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ProfessionalInfoResponse deleteProfessionalInfoByUserId(@RequestBody String userId) {

		try {
			iProfessionalInfoManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalInfoResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId" + userId);
			return ProfessionalInfoResponse.internalError(e.getMessage());
		}
		return ProfessionalInfoResponse.success(new ProfessionalInfoDTO());
	}
}
