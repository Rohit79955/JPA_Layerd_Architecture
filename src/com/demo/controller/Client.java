package com.demo.controller;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Client {
	// while writing structure service , dao,modal,database ---- while writing logic dao,service,client
    public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		
		// creating Employee object to insert into database
		Employee emp = new Employee(1, "Rohit", 60000, "hyd");
		
		//service.addEmployee(emp);
		
		// fetch 
		Employee employee = service.findByEmployeeId(1);
		System.out.println(employee);
		
		//update
//		employee.setEmpadd("kollur");
//		employee.setEmpname("Rohit Madgundi");
//		employee.setEmpsal(100000);
//		service.updateEmployee(employee);
		
		//delete
		//service.deleteEmployee(employee);
	}
}
