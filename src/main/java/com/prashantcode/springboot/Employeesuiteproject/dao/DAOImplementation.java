package com.prashantcode.springboot.Employeesuiteproject.dao;

import com.prashantcode.springboot.Employeesuiteproject.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAOImplementation implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public DAOImplementation(EntityManager theentityManager){
      entityManager=theentityManager;
    }
    @Override
    public List<Employee> findAll() {
        //creating a query
        TypedQuery <Employee> theQuery= entityManager.createQuery("from Employee", Employee.class);

        //Execute query then get list

        List<Employee> employees= theQuery.getResultList();


        //return the results
        return  employees;


    }

    @Override
    public Employee findById(int theId) {

        Employee theEmployee= entityManager.find(Employee.class, theId);

        return theEmployee;
    }

    @Override// here prashant don't make @Transactional cuz it wd be done by service layer there
    public Employee save(Employee theEmployee) {

        Employee dbEmployee= entityManager.merge(theEmployee);//save or update
        return dbEmployee;

    }

    @Override // same reason do not use Transactional layer
    public void deleteById(int theId) {
        Employee  theEmployee= entityManager.find(Employee.class, theId);

        entityManager.remove(theEmployee);
    }
}
