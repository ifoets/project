package com.ceic.mem.controller;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ciec.mem.dto.UsersRelationDTO;

public class UsersRelationTest {

	static ApplicationContext applicationContext = null;
	static UsersRelationController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(UsersRelationController.class);
	}

	@Test
	public void testAddRegistration() {
		UsersRelationDTO uRdto = new UsersRelationDTO("C12346", "C54322", true, new Date(), false, new Date(), true,
				new Date(), true, new Date(), true, new Date(), false, new Date(), true, new Date(), true,
				"aks007vit@gmail.com", false, new Date(), true, new Date(), false, new Date(), true, new Date(), false,
				new Date(), true, new Date());
		// controller.addOrUpdateUsersRelation(uRdto);
	}

	@Test
	public void testupdateRegistration() {
		UsersRelationDTO uRdto = new UsersRelationDTO("C12346", "C11111", true, new Date(), false, new Date(), true,
				new Date(), true, new Date(), true, new Date(), false, new Date(), true, new Date(), true,
				"aksumanvit@gmail.com", false, new Date(), true, new Date(), false, new Date(), true, new Date(), false,
				new Date(), true, new Date());
		// controller.addOrUpdateUsersRelation(uRdto);
	}

	@Test
	public void testfindRegistration() {

		// UsersRelationResponse response =
		// controller.fetchUsersRelationByUserId("C12346");
		// Assert.assertTrue(response.getUsersRelationDTO().getMailContent().equals("aksumanvit@gmail.com"));

	}

	@Test
	public void testdeleteRegistration() {

		//UsersRelationResponse response = controller.deleteUsersRelationByUserId("C12346");
		//Assert.assertTrue(response.getUsersRelationDTO().getFromUserId() == null);
	}

}
