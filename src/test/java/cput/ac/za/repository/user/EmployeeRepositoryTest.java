package cput.ac.za.repository.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.factory.user.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRepositoryTest {

    EmployeeRepository repository;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRepository.getRepository();
        employee = EmployeeFactory.buildEmployee("213058553"
                                                ,"Banele"
                                                ,"Mlamleli"
                                                ,"Male"
                                                ,"Human race");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(employee);
        assertNotNull(repository.getAll());
        System.out.println("Get All\n" + repository.getAll());
    }

    @Test
    public void create() {
        repository.create(employee);
        assertNotNull(repository.read(employee.getEmpNumber()));
        System.out.println("Created\n" + repository.read(employee.getEmpNumber()));
    }

    @Test
    public void read() {
        assertNotNull(repository.read(employee.getEmpNumber()));
        System.out.println("Read\n" + repository.read(employee.getEmpNumber()));
    }

    @Test
    public void update() {
        Employee employeeUpdated = EmployeeFactory.buildEmployee("213058553"
                ,"Matthew"
                ,"Peterson"
                ,"Male"
                ,"Coloured");
        repository.update(employeeUpdated);

        Employee em = repository.read("213058553");
        assertNotEquals(employee.getSurname(), em.getSurname());
        System.out.println("Updated\n" + repository.read("213058553"));
    }

    @Test
    public void delete() {

        repository.delete("213058553");
        assertNull(repository.read("213058553"));
        System.out.println("Deleted\n" + repository.read("213058553"));

    }
}