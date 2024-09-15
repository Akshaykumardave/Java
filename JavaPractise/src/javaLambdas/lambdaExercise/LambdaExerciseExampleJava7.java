package javaLambdas.lambdaExercise;

import java.util.*;

public class LambdaExerciseExampleJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, new Comparator<Person>() { // TODO can be replaced with List.sort(.....).
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.println("List is sorted in ascending order by last name");


        // Step 2: create a method that prints all elements in the list
        System.out.println("Printing all elements");
        printAll(people);


        // Step 3: create method that prints all people that have last name beginning with C
        System.out.println("Filtering in traditional way");
        printConditionallyTraditionalWay(people);

        System.out.println("Filtering with condition interface last name from C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("Filtering with condition interface last name from A");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("A");
            }
        });
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printConditionallyTraditionalWay(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("C")) {
                System.out.println(p);
            }
        }
    }

    private static void printConditionally(List<Person> people, Condition condition) { // this is the best practice to do
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}

interface Condition {
    boolean test(Person p);
}