package com.ceic.mem.controller;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ciec.mem.dto.UserProfileDTO;

public class UserProfileTest {

	static ApplicationContext applicationContext = null;
	static UserProfileController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(UserProfileController.class);
	}

	@Test
	public void testAddUserProfile() {
		UserProfileDTO userProfileDTO = new UserProfileDTO("C12346","abhimanyu kumar", "Self", 30, "5 fit 5 inch", "Hindu", "Kurmi", "Kumar",
				"India", "B-tech", "Software professional", "11,00,000", "83,000", "Spiritual inclined",new Date(),new Date());
		 //controller.addOrUpdateUserProfile(userProfileDTO);
	}

	@Test
	public void testUpdateUserProfile() {
		UserProfileDTO userProfileDTO = new UserProfileDTO("C12346","Rk Raj", "Broher", 30, "5 fit 5 inch", "Hindu", "Kurmi", "Kumar",
				"India", "B-tech", "Software professional", "11,00,000", "83,000", "Spiritual inclined",new Date(),new Date());
		 //controller.addOrUpdateUserProfile(userProfileDTO);
	}
	

	@Test
	public void testFetchUserProfileByUserId() {

		// UserProfileResponse response =
		 //controller.fetchUserProfileByUserId("C12346");
		 //Assert.assertTrue(response.getUserProfileDTO().getProfileFor().equals("Broher"));

	}

	@Test
	public void testDeleteUserProfileByUserId() {

		//UserProfileResponse response = controller.deleteUserProfileByUserId("C12346");
		//Assert.assertTrue(response.getUserProfileDTO().getAnnualIncome() == null);
	}

}
