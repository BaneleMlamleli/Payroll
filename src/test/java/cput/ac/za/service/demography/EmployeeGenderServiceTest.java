package cput.ac.za.service.demography;

import cput.ac.za.domain.demography.EmployeeGender;
import cput.ac.za.factory.demography.EmployeeGenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderServiceTest {

    EmployeeGenderService service;
    EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        service = EmployeeGenderService.getService();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("213058553"
                , "Male");
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
        service.create(employeeGender);
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
        service.create(employeeGender); //Because value gets deleted
        System.out.println(service.read("213058553"));

        EmployeeGender employeeGenderUpdated = EmployeeGenderFactory.buildEmployeeGender("213058553", "Updated");
        service.update(employeeGenderUpdated);
        EmployeeGender g = service.read("213058553");
        assertNotEquals(employeeGender.getGender(), g.getGender());
        System.out.println("Updated\n"+service.read("213058553"));
    }

    @Test
    public void delete() {
        service.delete("213058553");
        assertNull(service.read(employeeGender.getEmpNumber()));
        System.out.println("Delete\n"+service.read(employeeGender.getEmpNumber()));
    }
}