package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private Phone phone;
    private Address address;
    private Double salary;

}
