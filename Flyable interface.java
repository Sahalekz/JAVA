// Define the Flyable interface
interface Flyable {
    void fly_obj();
}

// Spacecraft class implementing Flyable interface
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Airplane class implementing Flyable interface
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Helicopter class implementing Flyable interface
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}

public class FlyableApp {
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
