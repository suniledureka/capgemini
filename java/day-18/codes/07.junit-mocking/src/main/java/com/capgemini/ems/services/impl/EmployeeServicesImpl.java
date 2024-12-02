package com.capgemini.ems.services.impl;

import com.capgemini.ems.dao.EmployeeDAO;
import com.capgemini.ems.services.EmployeeServices;

public class EmployeeServicesImpl implements EmployeeServices {
	private EmployeeDAO dao;
	
	public EmployeeDAO getDao() {
		return dao;
	}

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String getEmployeeNameById(int eid) {
		String empName = dao.findEmployeeNameById(eid);
		return empName;
	}

}
