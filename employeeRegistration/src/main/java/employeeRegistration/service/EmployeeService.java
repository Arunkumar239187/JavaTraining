package employeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import employeeRegistration.model.Employee;
import employeeRegistration.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeerepository;
	
	public Employee addEmployee( Employee emp) {
		System.out.println(emp);
		return employeerepository.save(emp);
	}

	public List<Employee> getAllEmployees() {
		return employeerepository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return  employeerepository.findById(id).orElse(null);
	}

	public Employee updateEmployees(Employee emp) {
		Employee employee = null;
		Optional<Employee> updateEmployee = employeerepository.findById(emp.getId());
		if (updateEmployee.isPresent()) {
			employee.setDomain(emp.getDomain());
			employee.setEmailId(emp.getEmailId());
			employee.setExperience(emp.getExperience());
			employee.setLocation(emp.getLocation());
			employee.setName(emp.getName());
			employee.setId(emp.getId());
		}
		else 
			return new Employee();
		return employee;
	}

	public String deleteEmployeeById(int id) {
		employeerepository.deleteById(id);
		return "Employee " + id + " got deleted";
	}

	
	


	

}
