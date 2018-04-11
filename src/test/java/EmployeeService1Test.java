import model.Employee;
import org.junit.Before;
import org.junit.Test;
import service.EmployeeService1;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeService1Test {

    EmployeeService1 employeeService1;

    @Before
    public void setUp() throws Exception {
        employeeService1 = new EmployeeService1();

    }

    @Test
    public void findAllFirstNameByLastName() throws Exception {

        String [] actualArrayOfFirstName = employeeService1.findArrayOfFirstNameByLastNameFromEmployeeList("Travolta");
        String [] expectedArrayOfLastName = {"John", "John", "Sean"};
        System.out.println(Arrays.toString(actualArrayOfFirstName));
        assertArrayEquals( actualArrayOfFirstName,expectedArrayOfLastName);
    }

    @Test
    public void findAllEmployeesByLastName() throws Exception {

        List<Employee> employees = employeeService1.findAllEmployeesByLastName("Travolta");
        assertEquals(employees.size(),3);
    }

    @Test
    public void findEmployeeListSortedBySalaryAsce() throws Exception {

        List<Employee> sortedEmployeeList = employeeService1.fndAllEmployeesSortedBySalary();
        sortedEmployeeList.forEach(System.out::println);
    }
}