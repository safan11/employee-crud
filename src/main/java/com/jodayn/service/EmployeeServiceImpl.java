package com.jodayn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jodayn.entity.Employee;
import com.jodayn.exception.IdNotFoundException;
import com.jodayn.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws IdNotFoundException {
		return employeeRepository.findById(id).orElseThrow(()-> new IdNotFoundException("No id present"));
	}

}
