package opps.inheritance;



class Animals {
    Animals() {
        System.out.println("I am an animal");
    }

    Animals(String animalName) {
    System.out.println("new animal name is: " + animalName);
    }
}

class Dogs extends Animals {
    Dogs() {
        super();
        System.out.println("I am a dog");
    }

    Dogs(String newDogName) {
        super(newDogName);
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        Dogs d2 = new Dogs("horse");
    }

}
