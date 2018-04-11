package service;

import model.Employee;
import repository.EmployeeRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService1 {

    EmployeeRepository employeeRepository;

    public EmployeeService1() {
        this.employeeRepository = new EmployeeRepository();
        employeeRepository.addEmployee();
    }

    public String[] findArrayOfFirstNameByLastNameFromEmployeeList(String lastName) {

        List<Employee> employeeList = employeeRepository.getEmployeeList();

       return employeeList.stream()
                          .filter(employee -> employee
                              .getLastName()
                              .equalsIgnoreCase(lastName))
                          .map(employee -> employee.getFirstName())
                          .toArray(String[]::new);

    }

    public List<Employee> findAllEmployeesByLastName(String lastName) {

        List<Employee> employeeList = employeeRepository.getEmployeeList();

        return employeeList.stream()
                           .filter(employee -> employee
                                    .getLastName()
                                    .equalsIgnoreCase(lastName))
                           .collect(Collectors.toList());

    }

    public List<Employee> fndAllEmployeesSortedBySalary() {

        List<Employee> sortedEmployeeList = employeeRepository.getEmployeeList();

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getSalary);
        Collections.sort(sortedEmployeeList,employeeComparator);

        return sortedEmployeeList;

    }
}
