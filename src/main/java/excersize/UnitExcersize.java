package excersize;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UnitExcersize {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Charls", "Bababe", 62),
                new Person("Lewis", "Carol", 56),
                new Person("Sarah", "Jones", 45),
                new Person("Jon", "Doe", 66)
                );

        // Step 1 sort all element by first name

        List<Person> sortedPeop =  people.stream().sorted(Comparator.comparing(Person::getLastName)).collect(Collectors.toList());

        // Step 2 create method that prints all the element in the list
        sortedPeop.forEach( s -> System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getAge()));


        // Step 3 print all people that have last name starting with c

       List<Person>  newList =  people.stream()
                .filter(s -> s.getLastName().startsWith("C"))
               .collect(Collectors.toList());

        newList.forEach( p -> System.out.println(p.getFirstName() + " " + p.getLastName()));


    }
}
