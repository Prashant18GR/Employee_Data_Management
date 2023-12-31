package com.prashantcode.springboot.Employeesuiteproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id ;
    @Column(name="first_name")
   private String firstname;

   @Column(name="last_name")
   private String lastname;
    @Column(name= "email")
    private String email;
     @Column(name= "post")
     private String post;
    @Column(name= "salary")
    private int salary;
   @Column(name="Branch")
   private  String Branch;
   public  Employee(){

   }

    public Employee(String firstname, String lastname, String email, String post, int salary, String branch) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.post = post;
        this.salary = salary;
        Branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", Branch='" + Branch + '\'' +
                '}';
    }
}
