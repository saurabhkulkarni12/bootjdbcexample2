package com.jdbc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jdbc.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Employee emp) {
		
		return  jdbcTemplate.update("insert into employee("
				+ "first_name,"
				+ "last_name,"
				+ "email,"
				+ "phone_number,"
				+ "age,"
				+ "gender)values(?,?,?,?,?,?)",
				new Object[] {
						emp.getFirst_name(),
						emp.getLast_name(),
						emp.getEmail(),
						emp.getPhone_number(),
						emp.getAge(),
						emp.getGender()});
	}

	@Override
	public int update(Employee emp, int id) {
	
		return jdbcTemplate.update("update employee set "
				+ "first_name=?,"
				+ "last_name=?,"
				+ "email=?,"
				+ "phone_number=?,"
				+ "age=?,"
				+ "gender=? where id=?",
				new Object[] {
						emp.getFirst_name(),
						emp.getLast_name(),
						emp.getEmail(),
						emp.getPhone_number(),
						emp.getAge(),
						emp.getGender(),id
				});
	}

	@Override
	public int delete(int id) {
		
		return jdbcTemplate.update("delete from employee where id=?",id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return jdbcTemplate.query("select * from employee",new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee getById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE id=?",new BeanPropertyRowMapper<Employee>(Employee.class),id);
	}

}
