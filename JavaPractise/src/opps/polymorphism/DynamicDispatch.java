package opps.polymorphism;


class Animal{
    public void m1(){
        System.out.println("This is m1 method in class Animal");
    }
}
class Tiger extends Animal{
    public void m1(){
        System.out.println("This is m1 method in class Tiger");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.m1();
    }
}
