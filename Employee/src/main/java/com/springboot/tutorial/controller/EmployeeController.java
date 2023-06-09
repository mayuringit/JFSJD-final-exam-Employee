package com.springboot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.tutorial.entity.Employee;
import com.springboot.tutorial.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

@Autowired
private EmployeeService employeeService;

@PostMapping
public Employee addEmployee(@RequestBody Employee employee) {
return employeeService.addEmployee(employee);
}

@GetMapping
public List getAllEmployees() {
return employeeService.getAllEmployees();
}
}