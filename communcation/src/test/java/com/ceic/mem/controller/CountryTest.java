package com.ceic.mem.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.CountryResponse;
import com.ceic.mem.model.external.EmployeeResponse;
import com.ciec.mem.dto.CountryDTO;
import com.ciec.mem.dto.EmployeeDTO;

public class CountryTest {

	static ApplicationContext applicationContext = null;
	static CountryController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(CountryController.class);
	}

	@Test
	public void testAddCountry() {

		CountryDTO CountryDTO = new CountryDTO(01, "India");
		//controller.addOrUpdateCountry(CountryDTO);
	}

	@Test
	public void testUpdateCountry() {
		CountryDTO CountryDTO = new CountryDTO(10, "USA");
		CountryDTO.setId(1);
		//controller.addOrUpdateCountry(CountryDTO);
	}

	@Test
	public void testFetchCountryByCountryCode() {

		//CountryResponse response = controller.fetchIncomeByCountryCode(10);
		//Assert.assertTrue(response.getCountryDTO().getCountryName().equals("USA"));

	}

	@Test
	public void testDeleteCountryByCountry() {

		//CountryResponse response = controller.deleteCountryByCountryCode(10);
		//Assert.assertTrue(response.getCountryDTO().getCountryName() == null);
	}

}
