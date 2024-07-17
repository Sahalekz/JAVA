// Abstract class Bird
abstract class Bird {
    // Abstract methods
    public abstract void fly();
    public abstract void makeSound();
}

// Concrete subclass Eagle extending Bird
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle flies high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle makes screeching sounds.");
    }
}

// Concrete subclass Hawk extending Bird
class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("Hawk flies swiftly through the air.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk makes a piercing cry.");
    }
}

public class BirdApp {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        System.out.println("Eagle:");
        eagle.fly();
        eagle.makeSound();

        System.out.println("\nHawk:");
        hawk.fly();
        hawk.makeSound();
    }
}
