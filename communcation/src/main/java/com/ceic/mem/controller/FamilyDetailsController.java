package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.FamilyDetailsResponse;
import com.ciec.mem.dto.FamilyDetailsDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IFamilyDetailsManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class FamilyDetailsController {
	private static final Logger LOG = LoggerFactory.getLogger(FamilyDetailsController.class);

	@Autowired
	private IFamilyDetailsManager iFamilyDetailsManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public FamilyDetailsResponse addOrUpdateFamilyDetails(@RequestBody FamilyDetailsDTO familyDetailsDTO) {
		try {
			familyDetailsDTO = iFamilyDetailsManager.persistOrMerge(familyDetailsDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for userId : " + familyDetailsDTO.getUserId());
			return FamilyDetailsResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId : " + familyDetailsDTO.getUserId());
			return FamilyDetailsResponse.internalError(e.getMessage());
		}
		return FamilyDetailsResponse.success(familyDetailsDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public FamilyDetailsResponse fetchFamilyDetailsByUserId(@RequestBody String userId) {
		FamilyDetailsDTO familyDetailsDTO = new FamilyDetailsDTO();

		try {
			familyDetailsDTO = iFamilyDetailsManager.findByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId: " + userId);
			return FamilyDetailsResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId:" + userId);
			return FamilyDetailsResponse.internalError(e.getMessage());
		}
		return FamilyDetailsResponse.success(familyDetailsDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public FamilyDetailsResponse deleteFamilyDetailsByUserId(@RequestBody String userId) {

		try {
			iFamilyDetailsManager.deleteByUserId(userId);
		} catch (MatrimonyException e) {
			LOG.error(e + " for userId :" + userId);
			return FamilyDetailsResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for userId :" + userId);
			return FamilyDetailsResponse.internalError(e.getMessage());
		}
		return FamilyDetailsResponse.success(new FamilyDetailsDTO());
	}
}
