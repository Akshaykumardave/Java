package javaLambdas;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printed inside runnable..!!");
            }
        });
        myThread.start();

        /// above and below both are same in terms of implementation
        Thread myLambdaThread = new Thread(() -> System.out.println("printed inside lambda runnable!!"));
        myLambdaThread.start();
    }
}
