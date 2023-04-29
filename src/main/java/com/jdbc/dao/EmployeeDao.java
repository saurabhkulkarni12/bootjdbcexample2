package com.jdbc.dao;
import java.util.List;   
import com.jdbc.model.Employee;

public interface EmployeeDao {
	int save(Employee emp);
	
	int update(Employee emp,int id);
	
	int delete(int id);
	
	List<Employee> getAllEmployees();
	
	Employee getById(int id); 

}
