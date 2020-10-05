package com.ceic.mem.controller;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ciec.mem.dto.ReligionInfoDTO;

public class ReligionInfoTest {

	static ApplicationContext applicationContext = null;
	static ReligionInfoController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(ReligionInfoController.class);
	}

	@Test
	public void testAddReligionInfo() {
		ReligionInfoDTO ReligionInfoDTO = new ReligionInfoDTO("C12346", "Muslim", "forward", "godaram", "starRassi",
				"dosh", null, null);
		//controller.addOrUpdateReligionInfo(ReligionInfoDTO);
	}

	@Test
	public void testUpdateReligionInfo() {
		ReligionInfoDTO ReligionInfoDTO = new ReligionInfoDTO("C12346", "Hindu", "forward", "godaram", "starRassi",
				"dosh", null, null);
		//controller.addOrUpdateReligionInfo(ReligionInfoDTO);
	}

	@Test
	public void testFetchReligionInfoByUserId() {

		//ReligionInfoResponse response = controller.fetchReligionInfoByUserId("C12346");
		//Assert.assertTrue(response.getReligionInfoDTO().getReligion().equals("Hindu"));

	}

	@Test
	public void testDeleteReligionInfoByUserId() {

		// ReligionInfoResponse response =
		 //controller.deleteReligionInfoByUserId("C12346");
		 //Assert.assertTrue(response.getReligionInfoDTO().getReligion() == null);
	}

}
