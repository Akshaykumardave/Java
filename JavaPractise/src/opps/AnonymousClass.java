package opps;

class Polygon {
    public void display() {
        System.out.println("Inside the polygon class");
    }

    Polygon() {

    }

    Polygon(int numberOfSides) {
        System.out.println("Number of sides polygon has: " + numberOfSides);
    }
}

class AnonymousDemo {
    public void createClass() {
        Polygon p1 = new Polygon(5) {
          public void display() {
              System.out.println("Inside an anonymous class");
          }
        };

        p1.display();
    }
}

public class AnonymousClass {

    public static void main(String[] args) {
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.createClass();
    }

}
