package com.capgemini.ems.dao;

import java.util.List;

import com.capgemini.ems.dto.Employee;

public interface EmployeeDAO {
	public Integer saveEmployee(Employee emp) throws Exception;
	
	public Employee findEmployeeById(Integer eno) throws Exception;
	
	public Integer updateEmployee(int eno, Employee emp) throws Exception;
	
	public Integer deleteEmployeeById(int eno) throws Exception;
	
	public List<Employee> findAll() throws Exception;
}
