package com.ceic.mem.controller;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ciec.mem.dto.ProfessionalPrefDTO;

public class ProfessionalPrefTest {

	static ApplicationContext applicationContext = null;
	static ProfessionalPrefController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(ProfessionalPrefController.class);
	}

	@Test
	public void testAddProfessionalPref() {
		ProfessionalPrefDTO professionalPrefDTO = new ProfessionalPrefDTO("C12346", "Be Tech", "Software professional",
				"19,00,000", null);
		//controller.addOrUpdateProfessionalPref(professionalPrefDTO);
	}

	@Test
	public void testUpdateProfessionalPref() {
		ProfessionalPrefDTO professionalPrefDTO = new ProfessionalPrefDTO("C12346", "MBA", "Marketing",
				"19,00,000", null);
		//controller.addOrUpdateProfessionalPref(professionalPrefDTO);
	}

	@Test
	public void testFetchProfessionalPrefByUserId() {

		//ProfessionalPrefResponse response = controller.fetchProfessionalPrefByUserId("C12346");
		//Assert.assertTrue(response.getProfessionalPrefDTO().getEducation().equals("MBA"));

	}

	@Test
	public void testDeleteProfessionalPrefByUserId() {

		//ProfessionalPrefResponse response =
		//controller.deleteProfessionalPrefByUserId("C12346");
		//Assert.assertTrue(response.getProfessionalPrefDTO().getEducation() == null);
	}

}
