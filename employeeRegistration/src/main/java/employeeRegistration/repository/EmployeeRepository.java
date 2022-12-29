package employeeRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employeeRegistration.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
