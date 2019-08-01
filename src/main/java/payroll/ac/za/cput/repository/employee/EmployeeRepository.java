package repository.employee;

import domain.Employee;
import repository.Repository;

import java.util.Set;

public interface EmployeeRepository extends Repository<Employee, Integer> {

    Set<Employee> getAll();

}
