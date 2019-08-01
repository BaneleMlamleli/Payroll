package factory;

import domain.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");
        Assert.assertNotNull(employee);

    }
}