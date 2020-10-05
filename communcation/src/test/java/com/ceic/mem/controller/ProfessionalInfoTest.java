package com.ceic.mem.controller;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ciec.mem.dto.ProfessionalInfoDTO;

public class ProfessionalInfoTest {

	static ApplicationContext applicationContext = null;
	static ProfessionalInfoController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(ProfessionalInfoController.class);
	}

	@Test
	public void testAddProfessionalInfo() {
		ProfessionalInfoDTO professionalInfoDTO = new ProfessionalInfoDTO("C12346", "B-Tech", "VIT University", "B-tech in IT",
				"Software Professional", "SSE", "GL", "19,00,000", "1,20,000", null);
		//controller.addOrUpdateProfessionalInfo(professionalInfoDTO);
	}

	@Test
	public void testUpdateProfessionalInfo() {
		ProfessionalInfoDTO professionalInfoDTO = new ProfessionalInfoDTO("C12346", "MBA", "VIT University", "B-tech in IT",
				"Software Professional", "SSE", "GL", "19,00,000", "1,20,000", null);
		//controller.addOrUpdateProfessionalInfo(professionalInfoDTO);
	}

	@Test
	public void testFetchProfessionalInfoByUserId() {

		//ProfessionalInfoResponse response = controller.deleteProfessionalInfoByUserId("C12346");
		//Assert.assertTrue(response.getProfessionalInfoDTO().getEducation()==null);

	}

	@Test
	public void testDeleteProfessionalPrefByUserId() {

		//ProfessionalPrefResponse response =
		//controller.deleteProfessionalPrefByUserId("C12346");
		//Assert.assertTrue(response.getProfessionalPrefDTO().getEducation() == null);
	}

}
