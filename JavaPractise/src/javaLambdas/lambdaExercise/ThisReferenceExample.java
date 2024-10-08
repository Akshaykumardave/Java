package javaLambdas.lambdaExercise;

public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Values of i is: " + i);
                System.out.println(this);
            }

            public String toString() {
                return "This is the anonymous inner class";
            }
        });
    }
}
