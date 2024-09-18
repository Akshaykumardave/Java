package JavaCollections;

import javaLambdas.lambdaExercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        // TODO - Above both loops are known as External iterator, since it provides more control over loop. It is sequential in nature, order is maintained
        System.out.println("Traditional for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Traditional for-in loop");
        for (Person p : people) {
            System.out.println(p);
        }

        /////////////////-------------------------------------------


        // TODO - The below collection or lambda for each loop is Internal iterator, since the looping is decided by runtime, the order of looping is not controlled
        // TODO - due to this it is not sequential in nature and multi threading can be used here.
        System.out.println("Lambda for each loop");
        people.forEach(System.out::println); // ---- used methods reference


        System.out.println("Stream for each with filtering");
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(System.out::println); // ---- used methods reference


        long countVal = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("A"))
                .count();

        // TODO - A stream API would have 3 things, (1) Source(which provides elements, eg: people), (2) Operation performed and
        //  (3) terminal operation (caused stream to act, eg: count())
        System.out.println(countVal);


    }
}
