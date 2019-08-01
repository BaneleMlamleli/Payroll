package factory;

import domain.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(int empNumber, String fname, String lname ){

        return new Employee.Builder()
                .empNumber(empNumber)
                .empFirstName(fname)
                .empLastName(lname)
                .build();
    }

}
