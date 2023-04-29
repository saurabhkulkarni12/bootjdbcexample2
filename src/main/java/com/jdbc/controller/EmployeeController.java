package com.jdbc.controller;
import org.springframework.web.bind.annotation.RestController;


import com.jdbc.dao.EmployeeDao;
import java.util.List;
import com.jdbc.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDao eDao;
	
	@GetMapping("/employee")
	public List<Employee> getEmployees(){
		return eDao.getAllEmployees(); 
		
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmpById(@PathVariable int id) {
		return eDao.getById(id);
	}
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee emp) {
		 return eDao.save(emp)+"Number of records inserted to database";
	}
	@PutMapping("/employee/{id}")
	public String updateEmp(@RequestBody Employee emp,@PathVariable int id) {
		return eDao.update(emp, id)+"Number of records updated";
		
	}
	@DeleteMapping("/employee/{id}")
	public String deleteEmpById(@PathVariable int id) {
		return eDao.delete(id)+"Number of records deleted";
	}
}
