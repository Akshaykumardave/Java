package javaLambdas;

import javaLambdas.lambdaExercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        System.out.println("Example with predicate and consumer,Person name starts with T");
        printConditionallyWithPredicateAndConsumer(people, p -> true, System.out::println); // TODO:  p -> System.out.println(p) === System.out::println // (p) -> method(p)
    }

    private static void printConditionallyWithPredicateAndConsumer(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people) {
            if(predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
