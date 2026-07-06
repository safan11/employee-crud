package com.jodayn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jodayn.entity.Employee;
import com.jodayn.service.EmployeeService;

@RestController // 
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	
	
}
