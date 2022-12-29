package employeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employeeRegistration.model.Employee;
import employeeRegistration.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping("/register")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeeservice.addEmployee(emp);
	}
	
	@GetMapping("/ust/employees")
	public List<Employee> getAllEmployees() {
		return employeeservice.getAllEmployees();
	}
	
	@GetMapping("/ust/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeservice.getEmployeeById(id);
	}
	
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeservice.updateEmployees(emp);
	}
	
	@DeleteMapping("/delete/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return employeeservice.deleteEmployeeById(id);
	}
	
}
