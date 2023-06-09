package com.springboot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

private String department;

// No-Arg Constructor
public Employee() {
}

// All-Arg Constructor
public Employee(Long id, String name, String department) {
this.id = id;
this.name = name;
this.department = department;
}

// Getters and Setters
public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getDepartment() {
return department;
}

public void setDepartment(String department) {
this.department = department;
}

// toString method to print all the attributes of the employee
@Override
public String toString() {
return "Employee{" +
"id=" + id +
", name='" + name + '\'' +
", department='" + department + '\'' +
'}';
}
}