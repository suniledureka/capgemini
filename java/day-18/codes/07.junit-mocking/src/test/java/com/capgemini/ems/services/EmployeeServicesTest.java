package com.capgemini.ems.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.capgemini.ems.dao.EmployeeDAO;
import com.capgemini.ems.services.impl.EmployeeServicesImpl;

class EmployeeServicesTest {
	
	static EmployeeServicesImpl empService;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		empService = new EmployeeServicesImpl();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		empService = null;
	}

	@Test
	void testGetEmployeeNameById() {
		//create a mock object for EmployeeDAO
		EmployeeDAO mockDaoObj = Mockito.mock(EmployeeDAO.class);
		
		empService.setDao(mockDaoObj);
		
		//--setting the behaviour for mock object 
		Mockito.when(mockDaoObj.findEmployeeNameById(101)).thenReturn("Sanjay");
		Mockito.when(mockDaoObj.findEmployeeNameById(102)).thenReturn("Praveen");
		
		int eid = 101;
		String ename = empService.getEmployeeNameById(eid);
		assertNotNull(ename);
	}

}
