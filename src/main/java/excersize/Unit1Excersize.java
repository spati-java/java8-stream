package excersize;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Unit1Excersize {

    public Unit1Excersize() {
    }
    

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Charls", "Bababe", 62),
                new Person("Lewis", "Carol", 56),
                new Person("Sarah", "Jones", 45),
                new Person("Jon", "Doe", 66)
        );


        String name = "";
        if (name != null) {


        }


        // Step 1 sort all element by first name
        // approach 1
        List<Person> sortedPeop = people.stream().sorted(Comparator.comparing(Person::getLastName)).collect(Collectors.toList());

        // Step 2 create method that prints all the element in the list
        sortedPeop.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getAge()));


        // Step 3 print all people that have last name starting with c
        printConditionaly(sortedPeop, p -> p.getLastName().startsWith("C"));

        performConditionaly(sortedPeop, p -> p.getLastName().startsWith("C"), p -> System.out.println());

       /*List<Person>  newList =  people.stream()
                .filter(s -> s.getLastName().startsWith("C"))
               .collect(Collectors.toList());

        newList.forEach( p -> System.out.println(p.getFirstName() + " " + p.getLastName())); */

    }

    public static void printConditionaly(List<Person> people, Predicate<Person> predicate) {

        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }

    }


    public static void performConditionaly(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }

    }


    @FunctionalInterface
    interface Condition {

        boolean test(Person p);
    }
}
