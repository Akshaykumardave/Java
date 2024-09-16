package javaLambdas.lambdaExercise;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        doProcess(a, p -> System.out.println(a + b)); // TODO: variables used inside lambda expression would be final by nature, we can not modify it, this is known as closure
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
