package com.ceic.mem.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.PartnerPrefResponse;
import com.ciec.mem.dto.PartnerPrefDTO;

public class PartnerPrefTest {

	static ApplicationContext applicationContext = null;
	static PartnerPrefController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(PartnerPrefController.class);
	}

	@Test
	public void testAddProfessionalPref() {
		PartnerPrefDTO partnerPrefDTO = new PartnerPrefDTO("C12346", 26, 31, "never marrier", "average", "vegetarian", "never smoke",
				"never drink", "Hindi", "no cast bar", "star", false, null);
		//controller.addOrUpdatePartnerPref(partnerPrefDTO);
	}

	@Test
	public void testUpdateProfessionalPref() {
		PartnerPrefDTO partnerPrefDTO = new PartnerPrefDTO("C12346", 26, 31, "divoce", "slim", "vegetarian", "never smoke",
				"never drink", "Hindi", "no cast bar", "star", false, null);
		//controller.addOrUpdatePartnerPref(partnerPrefDTO);
	}

	@Test
	public void testFetchProfessionalPrefByUserId() {

		//PartnerPrefResponse response = controller.fetchPartnerPrefByUserId("C12346");
		//Assert.assertTrue(response.getPartnerPrefDTO().getMaritalStatus().equals("divoce"));

	}

	@Test
	public void testDeleteProfessionalPrefByUserId() {

		PartnerPrefResponse response =
		controller.deletePartnerPrefByUserId("C12346");
		Assert.assertTrue(response.getPartnerPrefDTO().getCaste() == null);
	}

}
