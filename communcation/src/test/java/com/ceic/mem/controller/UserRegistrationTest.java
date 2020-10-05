package com.ceic.mem.controller;

import java.util.Date;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.UserRegistrationResponse;
import com.ciec.mem.dto.UserRegistrationDTO;

public class UserRegistrationTest {

	static ApplicationContext applicationContext = null;
	static UserRegistrationController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(UserRegistrationController.class);
	}
	//TODO Note updating and saving not together
    @Test
	public void testAddRegistration() {
		UserRegistrationDTO uRdto = new UserRegistrationDTO("C123456", "8792462270", "aks007vit@gmail.com", "self",
				"Male", new Date(), "Hindi", "Kurmi", "India", "06bit007", new Date(), new Date(), new Date());
		//controller.a ddOrUpdateUserRegistration(uRdto);
		
	}
	
	@Test
	public void testupdateRegistration() {
		UserRegistrationDTO uRdto = new UserRegistrationDTO("C123456", "8792462271", "akssumanvit@gmail.com", "forsis",
				"Female", new Date(), "Punjabi", "Kurmr", "Us", "06bit008", new Date(), new Date(), new Date());
		//controller.addOrUpdateUserRegistration(uRdto);
	}
	 

	@Test
	public void testfindRegistration() {

		//UserRegistrationResponse response = controller.fetchUserRegistrationByUserId("C123456");
		//Assert.assertTrue(response.getUserRegistrationDTO().getMobileNo().equals("8792462271"));
	}

	@Test
	public void testdeleteRegistration() {

		UserRegistrationResponse response = controller.deleteUserRegistrationByUserId("C123456");
		Assert.assertTrue(response.getUserRegistrationDTO().getMobileNo()==null);
	}
}
