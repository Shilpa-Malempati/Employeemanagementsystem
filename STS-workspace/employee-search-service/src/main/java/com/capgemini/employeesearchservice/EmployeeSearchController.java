package com.capgemini.employeesearchservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeSearchController {
	@Autowired
	EmployeeSearch employeeSearch;
	
	@GetMapping("/employee/find/{id}")
	public Employee findById(@PathVariable int id)
	{
		
		return employeeSearch.getEmployeeById(id);
	}
	@GetMapping("/employee/findAll")
	public List<Employee> findById()
	{
		return employeeSearch.getAllEmployee();
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee emp)
	{
		employeeSearch.addEmployee(emp);
		return "Employee Added Successfully";
				
	}
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee emp)
	{
		employeeSearch.updateEmployee(emp);
		return "Employee updated Successfully";
				
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public String removeEmployeeById(@PathVariable int id)
	{
		employeeSearch.removeEmployeeById(id);
		return "Employee removed Successfully";
				
	}

}

