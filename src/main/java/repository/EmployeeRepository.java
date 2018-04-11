package repository;

import lombok.Data;
import model.Address;
import model.Employee;
import model.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class EmployeeRepository {

    List<Employee> employeeList = new ArrayList();

    public void addEmployee(){

        employeeList = Arrays.asList(
                new Employee(1,"Aron" , "Hank",
                        new Phone("mobile" , "405-303-8594"),
                        new Address("1325" , "N walker Ave", "OKC", "OK","73103") , 3000.00),

                new Employee(2,"John" , "Travolta",
                        new Phone("mobile" , "200-303-7777"),
                        new Address("1326" , "N walker Ave", "OKC", "OK","73103"),5600.56),

                new Employee(2,"John" , "Travolta",
                        new Phone("mobile" , "673-434-5456"),
                        new Address("1326" , "N walker Ave", "OKC", "OK","73103"),87434.44),

                new Employee(2,"Abagnale" , "Frank",
                        new Phone("home" , "343-434-4433"),
                        new Address("1326" , "N walker Ave", "OKC", "OK","73103"),87434.42),

                new Employee(2,"Sean" , "Travolta",
                        new Phone("mobile" , "405-304-8594"),
                        new Address("1326" , "N walker Ave", "OKC", "OK","73103"),87434.00)

        );
    }
}
