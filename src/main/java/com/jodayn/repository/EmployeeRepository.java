package com.jodayn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jodayn.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
