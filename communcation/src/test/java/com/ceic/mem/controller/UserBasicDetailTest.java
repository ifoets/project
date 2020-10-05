package com.ceic.mem.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.UserBasicDetailResponse;
import com.ciec.mem.dto.UserBasicDetailDTO;

public class UserBasicDetailTest {

	static ApplicationContext applicationContext = null;
	static UserBasicDetailController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(UserBasicDetailController.class);
	}

	@Test
	public void testAddUserBasicDetail() {
		UserBasicDetailDTO userBasicDetailDTO = new UserBasicDetailDTO("C12346", "Sister", "Chanchal", "Fair", 21,
				"average", "5 fit 2 inch", 45, "Hindi", "never married", "vegeratain", "never drink", "No smoker", null,
				null, null);
		//controller.addOrUpdateUserBasicDetail(userBasicDetailDTO);
	}

	@Test
	public void testUpdateUserBasicDetail() {
		UserBasicDetailDTO userBasicDetailDTO = new UserBasicDetailDTO("C12346", "Brother", "R K Raj", "Fair", 21,
				"average", "5 fit 2 inch", 45, "Hindi", "never married", "vegeratain", "never drink", "No smoker", null,
				null, null);
		//controller.addOrUpdateUserBasicDetail(userBasicDetailDTO);
	}

	@Test
	public void testFetchUserBasicDetailByUserId() {

		//UserBasicDetailResponse response = controller.fetchUserBasicDetailByUserId("C12346");
		//Assert.assertTrue(response.getuSserBasicDetailDTO().getProfileFor().equals("Brother"));

	}

	@Test
	public void testDeleteUserBasicDetailByUserId() {

		UserBasicDetailResponse response = controller.deleteUserBasicDetailByUserId("C12346");
		Assert.assertTrue(response.getuSserBasicDetailDTO().getProfileFor() == null);
	}

}
