package com.ceic.mem.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.IncomeResponse;
import com.ciec.mem.dto.IncomeDTO;

public class IncomeTest {

	static ApplicationContext applicationContext = null;
	static IncomeController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(IncomeController.class);
	}

	@Test
	public void testAddIncome() {

		IncomeDTO dto = new IncomeDTO("1800000");
		//controller.addOrUpdateIncome(dto);
	}

	@Test
	public void testUpdateIncome() {
		IncomeDTO dto = new IncomeDTO(1, "120000");
		//controller.addOrUpdateIncome(dto);
	}

	@Test
	public void testFetchIncomeByYearly() {

		//IncomeResponse response = controller.fetchIncomeByYearly("120000");
		//Assert.assertTrue(response.getIncomeDTO().getYearly().equals("120000"));

	}

	@Test
	public void testDeleteProfessionalPrefByUserId() {

		//IncomeResponse response = controller.deleteIncomeByYearly("120000");
		//Assert.assertTrue(response.getIncomeDTO().getYearly() == null);
	}

}
