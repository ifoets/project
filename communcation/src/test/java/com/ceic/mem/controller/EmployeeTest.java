package com.ceic.mem.controller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ceic.mem.model.external.EmployeeResponse;
import com.ciec.mem.dto.EmployeeDTO;

public class EmployeeTest {

	static ApplicationContext applicationContext = null;
	static EmployeeController controller = null;

	@BeforeClass
	public static void setup() {
		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/spring/appServlet-context.xml");
		controller = applicationContext.getBean(EmployeeController.class);
	}

	@Test
	public void testAddEmployee() {

		EmployeeDTO employeeDTO = new EmployeeDTO("Sof1tware");
		//controller.addOrUpdateEmployee(employeeDTO);
	}

	@Test
	public void testUpdateEmployee() {
		EmployeeDTO employeeDTO = new EmployeeDTO(1, "C11100oo");
		//controller.addOrUpdateEmployee(employeeDTO);
	}

	@Test
	public void testFetchEmployeeByEmployee() {

		//EmployeeResponse response = controller.fetchIncomeByEmployee("C11A");
		//Assert.assertTrue(response.getEmployeeDTO().getEmployee().equals("C11A"));

	}

	@Test
	public void testDeleteEmployeeByEmployee() {

		//EmployeeResponse response = controller.deleteIncomeByEmployee("C11A");
		//Assert.assertTrue(response.getEmployeeDTO().getEmployee() == null);
	}

}
