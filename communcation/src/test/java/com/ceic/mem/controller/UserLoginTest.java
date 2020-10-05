package com.ceic.mem.controller;

import java.util.Date;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.UserLoginResponse;
import com.ciec.mem.dto.UserLoginDTO;

public class UserLoginTest {

	static ApplicationContext applicationContext = null;
	static UserLoginController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(UserLoginController.class);
	}

	@Test
	public void testAddUserLogin() {
		UserLoginDTO userLoginDTO = new UserLoginDTO("C12346", "aks007vit", "8792462270", "active", true, new Date(),
				new Date());
		//controller.addOrUpdateUserLogin(userLoginDTO);
	}

	@Test
	public void testUpdateUserLogin() {
		UserLoginDTO userLoginDTO = new UserLoginDTO("C12346", "aksumanvit", "8792462271", "inactive", false, new Date(),
				new Date());
		//controller.addOrUpdateUserLogin(userLoginDTO);
	}

	@Test
	public void testFetchUserLoginByUserId() {

		 //UserLoginResponse response =
		 //controller.fetchUserLoginByUserId("C12346");
		 //Assert.assertTrue(response.getUserLoginDTO().getMobileNo().equals("8792462271"));

	}

	@Test
	public void testDeleteUserLoginByUserId() {

		 UserLoginResponse response =
		 controller.deleteUserLoginByUserId("C12346");
		 Assert.assertTrue(response.getUserLoginDTO().getMobileNo() == null);
	}

}
