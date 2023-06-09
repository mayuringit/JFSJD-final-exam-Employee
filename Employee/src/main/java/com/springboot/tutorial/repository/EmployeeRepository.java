package com.springboot.tutorial.repository;

import com.springboot.tutorial.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}