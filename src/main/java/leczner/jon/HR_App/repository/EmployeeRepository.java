package leczner.jon.HR_App.repository;

import leczner.jon.HR_App.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jonathanleczner on 10/25/16.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
