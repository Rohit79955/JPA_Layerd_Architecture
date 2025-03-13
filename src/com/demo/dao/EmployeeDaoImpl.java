package com.demo.dao;

import javax.persistence.EntityManager;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	// creating entity object to get information from the database
	 EntityManager entity;
	 
	 public EmployeeDaoImpl() {
		entity = JPAUtil.getEntityManager();
	}
	@Override
	public Employee getEmployeeById(int empid) {
		    Employee getemp = entity.find(Employee.class, empid);
		   return getemp;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		entity.merge(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		entity.remove(emp);
		
	}

	@Override
	public void beginTranscation() {
		entity.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entity.getTransaction().commit();
		
	}

}
