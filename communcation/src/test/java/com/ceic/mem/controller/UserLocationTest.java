package com.ceic.mem.controller;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ciec.mem.dto.UserLocationDTO;

public class UserLocationTest {

	static ApplicationContext applicationContext = null;
	static UserLocationController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(UserLocationController.class);
	}

	@Test
	public void testAddUserLogin() {
		UserLocationDTO userLocationDTO = new UserLocationDTO("C12346", "PATNA","BIHAR", "INDIA", "INDIAN");
		//controller.addOrUpdateUserLocation(userLocationDTO);
	}

	@Test
	public void testUpdateUserLogin() {
		UserLocationDTO userLocationDTO = new UserLocationDTO("C12346", "BANGALORE","kARNATKA", "INDIA", "INDIAN");
		//controller.addOrUpdateUserLocation(userLocationDTO);
	}

	@Test
	public void testFetchUserLoginByUserId() {

		//UserLocationResponse response = controller.fetchUserLocationByUserId("C12346");
		//Assert.assertTrue(response.getUserLocationDTO().getCity().equals("BANGALORE"));

	}

	@Test
	public void testDeleteUserLoginByUserId() {

		//UserLocationResponse response = controller.deleteUserLocationByUserId("C12346");
		//Assert.assertTrue(response.getUserLocationDTO().getCity() == null);
	}

}
