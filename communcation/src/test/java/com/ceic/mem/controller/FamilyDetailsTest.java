package com.ceic.mem.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.FamilyDetailsResponse;
import com.ceic.mem.model.external.IncomeResponse;
import com.ceic.mem.service.impl.FamilyDetailsManagerImpl;
import com.ciec.mem.dto.FamilyDetailsDTO;
import com.ciec.mem.dto.IncomeDTO;

public class FamilyDetailsTest {

	static ApplicationContext applicationContext = null;
	static FamilyDetailsController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(FamilyDetailsController.class);
	}

	@Test
	public void testAddFamilyDetails() {

		FamilyDetailsDTO familyDetailsDTO = new FamilyDetailsDTO("C12346", "Farmer", "Nuclear", "Home Maker", "Middle class", 2, "Nice", 
				2, "Hi balanceing between them", null);
		//controller.addOrUpdateFamilyDetails(familyDetailsDTO);
	}

	@Test
	public void testUpdateFamilyDetails() {
		FamilyDetailsDTO familyDetailsDTO = new FamilyDetailsDTO("C12346", "Officer", "Nuclear", "Home Maker", "Middle class", 2, "Nice", 
				2, "Hi balanceing between them", null);
		//controller.addOrUpdateFamilyDetails(familyDetailsDTO);
	}

	@Test
	public void testFetchFamilyDetailsByUserId() {

		//FamilyDetailsResponse response = controller.fetchFamilyDetailsByUserId("C12346");
		//Assert.assertTrue(response.getFamilyDetailsDTO().getFatherStatus().equals("Officer"));

	}

	@Test
	public void testDeleteFamilyDetailsByUserId() {

		//FamilyDetailsResponse response = controller.deleteFamilyDetailsByUserId("C12346");
		//Assert.assertTrue(response.getFamilyDetailsDTO().getFatherStatus()==null);
	}

}
