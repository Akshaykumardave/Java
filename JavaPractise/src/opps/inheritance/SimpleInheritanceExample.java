package opps.inheritance;


class Animal {
    String name;
    public void eat() {
        System.out.println("It can eat");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog can eat");
    }

    public void display() {
        System.out.println("My pet name is " + name);
    }
}
public class SimpleInheritanceExample{

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "pigaru";
        dog.display();

        dog.eat();
    }

}
