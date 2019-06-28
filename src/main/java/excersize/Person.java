package excersize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Person {

    private String firstName;

    private String lastName;

    private int age;
}
