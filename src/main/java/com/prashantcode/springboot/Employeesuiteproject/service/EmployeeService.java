package com.prashantcode.springboot.Employeesuiteproject.service;

import com.prashantcode.springboot.Employeesuiteproject.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);


    Employee save(Employee TheEmployee);

    void deleteById(int theId);


}
