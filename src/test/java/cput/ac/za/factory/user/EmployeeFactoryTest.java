package cput.ac.za.factory.user;

import cput.ac.za.domain.user.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    Employee employee;
    @Before
    public void setUp() throws Exception {
        employee = EmployeeFactory.buildEmployee("213058553"
                                                 ,"Banele"
                                                 ,"Mlamleli"
                                                 , "Male"
                                                 ,"Human race");
    }

    @Test
    public void buildEmployee() {
        assertNotNull(employee);
        System.out.println(employee);
    }
}