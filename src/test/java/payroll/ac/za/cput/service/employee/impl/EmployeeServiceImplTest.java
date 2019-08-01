package service.employee.impl;

import domain.Employee;
import factory.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.employee.EmployeeService;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeService service;

    @Before
    public void setUp() throws Exception {
        this.service = EmployeeServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Employee> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        service.create(employee);
        Employee inRepo = service.read(employee.getEmpNumber());

        employee.setEmpFirstName("Not Riaz");

        service.update(employee);

        Assert.assertEquals(employee.getEmpNumber(), inRepo.getEmpNumber());

    }

    @Test
    public void delete() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getEmpNumber());

        Employee deleted = service.read(employee.getEmpNumber());

        Assert.assertNull(deleted);

    }
}