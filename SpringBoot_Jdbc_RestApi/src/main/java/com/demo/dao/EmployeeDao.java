package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDao {
    
	// constructor autoWiring
	private JdbcTemplate jdbcTemplate;
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//inserting data into database
	public int addEmployee(Employee emp) {
		String sql = "insert into employee_springboot(empname,empsal,empadd) values (?,?,?)";
		return jdbcTemplate.update(sql,emp.getEmpname(),emp.getEmpsal(),emp.getEmpadd());
	}
	
	//updating the record
	public int updateEmployee(Employee emp) {
		String sql = "update employee_springboot set empname=?,empsal=?,empadd=? where empid=?";
		return jdbcTemplate.update(sql,emp.getEmpname(),emp.getEmpsal(),emp.getEmpadd());
	}
	
	//get Employee
	public Employee getEmployee(int empid) {
		String sql = "select * from employee_springboot where empid=?";
		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(),empid);
	}
	
	//get All employees
	public List<Employee> getAllEmployees(){
		String sql = "select * from employee_springboot";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
	
	//delete Employee
	public int deleteEmployee(int empid) {
		String sql = "delete from employee_springboot where empid=?";
		return jdbcTemplate.update(sql,empid);
	}
	
	private static class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEmpid(rs.getInt("empid"));
			emp.setEmpname(rs.getString("empname"));
			emp.setEmpsal(rs.getInt("empsal"));
			emp.setEmpadd(rs.getString("empadd"));
			return emp;
		}
    
		
	}
}
