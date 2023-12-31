package com.prashantcode.springboot.Employeesuiteproject.dao;


import com.prashantcode.springboot.Employeesuiteproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO  {
    List<Employee> findAll();

    Employee findById(int theId);


     Employee save(Employee TheEmployee);

    void deleteById(int theId);



}
