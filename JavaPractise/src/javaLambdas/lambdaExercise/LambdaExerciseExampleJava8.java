package javaLambdas.lambdaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// in this we are trying to use only lambda expression instead using anonymous class
public class LambdaExerciseExampleJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
        System.out.println("List is sorted in ascending order by last name");

        // Step 2: create a method that prints all elements in the list
        System.out.println("Printing all elements"); // TODO -- replaced this print all method with printConditionally
        printConditionally(people, p -> true);

        // Step 3: create method that prints all people that have last name beginning with C
        System.out.println("Filtering with condition interface last name from C");
        printConditionally(people, (Person p) -> p.getLastName().startsWith("C"));

        System.out.println("Filtering with condition interface last name from A");
        printConditionally(people, p -> p.getLastName().startsWith("A"));

        System.out.println("Filtering with condition interface first name from C");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Condition condition) { // this is the best practice to do
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
