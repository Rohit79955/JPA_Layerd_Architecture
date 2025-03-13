package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	// creating Dao object in service 
	 EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		
		dao = new EmployeeDaoImpl();
		
	}
	
	
	
	@Override
	public void addEmployee(Employee emp) {
		dao.beginTranscation();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTranscation();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTranscation();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee findByEmployeeId(int empid) {
		Employee femp = dao.getEmployeeById(empid);
		return femp;
	}

}
