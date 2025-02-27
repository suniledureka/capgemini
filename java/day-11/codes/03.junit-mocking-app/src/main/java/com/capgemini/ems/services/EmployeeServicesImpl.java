package com.capgemini.ems.services;

import com.capgemini.ems.repository.EmployeeRepository;

public class EmployeeServicesImpl implements EmployeeServices {
	private EmployeeRepository employeeRepo;
	
	public EmployeeRepository getEmployeeRepo() {
		return employeeRepo;
	}

	public void setEmployeeRepo(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
	public String getEmployeeNameById(int eid) {
		String empName = employeeRepo.findEmployeeNameById(eid);
		return empName.toUpperCase();
	}

}
