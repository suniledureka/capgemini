package com.capgemini.ems.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.capgemini.ems.repository.EmployeeRepository;

class EmployeeServicesTest {
	
	@Test
	void testGetEmployeeNameById() {
		EmployeeServicesImpl empServiceObj = new EmployeeServicesImpl();
		
		//create a mock object for EmployeeDAO
		EmployeeRepository empRepoMock = Mockito.mock(EmployeeRepository.class);
		
		//inject mock object to service component
		empServiceObj.setEmployeeRepo(empRepoMock);
		
		//--setting the behaviour for mock object 
		Mockito.when(empRepoMock.findEmployeeNameById(101)).thenReturn("Sanjay");
		
		int empId = 101;
		String empName = empServiceObj.getEmployeeNameById(empId);
		
		assertNotNull(empName);
	}

}
