package com.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("emp1")
    public Employee getEmployeeDetails(){
        Employee employee = new Employee(getDepartment());
        employee.setEmpName("Steven");
        employee.setEmpID(4444);
        return employee;
    }
    @Bean
    public Department getDepartment(){
        return new Department(101,"Production");
    }
}
