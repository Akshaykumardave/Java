package javaLambdas.lambdaInterface;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting lambdaGreeting = () -> System.out.println("Hello World!");

        Greeting innerClassGreeting = new Greeting() { // this is example of anonymous inner cass
            @Override
            public void perform() {
                System.out.println("Hello world!");
            }
        };

        greeter.greet(lambdaGreeting);
//        greeter.greet(() -> System.out.println("Hello World!"));
        greeter.greet(innerClassGreeting);
    }

}
