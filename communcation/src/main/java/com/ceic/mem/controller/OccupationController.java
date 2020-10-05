package com.ceic.mem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceic.mem.model.external.OccupationResponse;
import com.ciec.mem.dto.OccupationDTO;
import com.ciec.mem.exception.MatrimonyException;
import com.ciec.mem.service.IOccupationManager;

@RestController
@RequestMapping("/ceic/matrimony")
public class OccupationController {
	private static final Logger LOG = LoggerFactory.getLogger(OccupationController.class);

	@Autowired
	private IOccupationManager iOccupationManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OccupationResponse addOrUpdateOccupation(@RequestBody OccupationDTO occupationDTO) {
		try {
			occupationDTO = iOccupationManager.persistOrMerge(occupationDTO);

		} catch (MatrimonyException e) {
			LOG.error(e + " for occupation in" + occupationDTO.getOccupation());
			return OccupationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for occupation in : " + occupationDTO.getOccupation());
			return OccupationResponse.internalError(e.getMessage());
		}
		return OccupationResponse.success(occupationDTO);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public OccupationResponse fetchOccupationByOccupation(@RequestBody String occupationIn) {
		OccupationDTO occupationDTO = new OccupationDTO();

		try {
			occupationDTO = iOccupationManager.findByOccupation(occupationIn);
		} catch (MatrimonyException e) {
			LOG.error(e + " for occupation" + occupationIn);
			return OccupationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for occupation" + occupationIn);
			return OccupationResponse.internalError(e.getMessage());
		}
		return OccupationResponse.success(occupationDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public OccupationResponse deleteOccupationByOccupation(@RequestBody String occupationIn) {

		try {
			iOccupationManager.deleteByOccupation(occupationIn);
		} catch (MatrimonyException e) {
			LOG.error(e + " for occupation :" + occupationIn);
			return OccupationResponse.notFound(e.getMessage());
		} catch (Exception e) {
			LOG.error(e + " for occupation :" + occupationIn);
			return OccupationResponse.internalError(e.getMessage());
		}
		return OccupationResponse.success(new OccupationDTO());
	}
}
