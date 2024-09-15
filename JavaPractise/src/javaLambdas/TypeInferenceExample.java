package javaLambdas;

public class TypeInferenceExample {
    public static void main(String[] args) {
        printLambda(s -> s.length()); // printLambda(String::length); --> Method reference
    }

    public static void printLambda(StringLengthLambda l) {
       System.out.println(l.getLength("Akshay kumar dave"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}