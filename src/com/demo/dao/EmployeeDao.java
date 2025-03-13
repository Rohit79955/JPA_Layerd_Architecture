package com.demo.dao;

import com.demo.model.Employee;

public interface EmployeeDao {
	
    Employee getEmployeeById(int empid);
    
    void addEmployee(Employee emp);
    
    void updateEmployee(Employee emp);
    
    void deleteEmployee(Employee emp);
    
    void beginTranscation();
    
    void commitTransaction();
}
