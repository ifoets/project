package com.ceic.mem.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.OccupationResponse;
import com.ciec.mem.dto.OccupationDTO;

public class OccupationTest {

	static ApplicationContext applicationContext = null;
	static OccupationController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(OccupationController.class);
	}

	@Test
	public void testAddOccupation() {

		OccupationDTO dto = new OccupationDTO("software");
		//controller.addOrUpdateOccupation(dto);
	}

	@Test
	public void testUpdateProfessionalPref() {
		OccupationDTO dto = new OccupationDTO(1, "M1B1ooA");
		controller.addOrUpdateOccupation(dto);
	}

	@Test
	public void testFetchProfessionalPrefByUserId() {

		//OccupationResponse response = controller.fetchOccupationByOccupation("MBA");
		//Assert.assertTrue(response.getOccupationDTO().getOccupation().equals("MBA"));

	}

	@Test
	public void testDeleteProfessionalPrefByUserId() {

		//OccupationResponse response = controller.deleteOccupationByOccupation("MBA");
		//Assert.assertTrue(response.getOccupationDTO().getOccupation() == null);
	}

}
