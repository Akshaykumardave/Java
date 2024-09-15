public class SimpleClass {

    int a = 10;
    private static int i = 100;

    SimpleClass() {
        System.out.println("This is constructor");
    }

    SimpleClass(int a) {
        System.out.println("This is constructor value of a is -->" + a);
    }

        public void m1() {
       String str = "akshay";
        System.out.println("m1 method");
    }

    {
        System.out.println("block");
    }

    static {
        System.out.println("static block");
        System.out.println("Value of i is -->" + i);
    }

    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        simpleClass.m1();
        SimpleClass simpleClass1 = new SimpleClass(10);
        simpleClass1.m1();
    }


}
