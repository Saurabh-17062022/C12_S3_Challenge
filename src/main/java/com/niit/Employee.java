package com.niit;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empID;
    private String empName;
    @Autowired
    private Department department;

    public Employee(int empID, String empName, Department department) {
        this.empID = empID;
        this.empName = empName;
        this.department = department;
    }

    public Employee() {
    }

    public Employee(Department department) {

    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", department=" + department +
                '}';
    }
}
