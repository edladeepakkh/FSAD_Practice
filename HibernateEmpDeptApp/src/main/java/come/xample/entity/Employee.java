package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    private String name;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department dept;

    public Employee() {}

    public Employee(String name, double salary, Department dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDept() {
        return dept;
    }
}
