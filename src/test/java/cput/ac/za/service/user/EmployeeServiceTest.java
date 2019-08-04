package cput.ac.za.service.user;

import cput.ac.za.domain.user.Employee;
import cput.ac.za.factory.user.EmployeeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    EmployeeService service;
    Employee employee;

    @Before
    public void setUp() throws Exception {
          service = EmployeeService.getService();
                 employee = EmployeeFactory.buildEmployee("213058553"
                                                        , "Banele"
                                                        , "Mlamleli"
                                                        , "Male"
                                                        ,"Human race");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(employee);
        assertNotNull(service.read("213058553"));
        System.out.println("Created\n" + service.read("213058553"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("213058553"));
        System.out.println("Read\n"+ service.read("213058553"));
    }

    @Test
    public void update() {
        service.create(employee); //Because value gets deleted
        System.out.println(service.read("213058553"));

        Employee employeeUpdated = EmployeeFactory.buildEmployee("213058553", "Shaun", "Hendrick", "Updated","Human race");
        service.update(employeeUpdated);
        Employee em = service.read("213058553");
        assertNotEquals(employee.getSurname(), em.getSurname());
        System.out.println("Updated\n"+service.read("213058553"));
    }

    @Test
    public void delete() {
        service.delete("213058553");
        assertNull(service.read(employee.getEmpNumber()));
        System.out.println("Delete\n"+service.read(employee.getEmpNumber()));
    }
}