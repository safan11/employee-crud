package com.jodayn.service;

import java.util.List;

import com.jodayn.entity.Employee;
import com.jodayn.exception.IdNotFoundException;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id) throws IdNotFoundException;
	
}
