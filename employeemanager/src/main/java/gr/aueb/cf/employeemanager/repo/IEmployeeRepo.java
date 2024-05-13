package gr.aueb.cf.employeemanager.repo;

import gr.aueb.cf.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
}
