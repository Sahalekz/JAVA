public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    private boolean isStarted;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isStarted = false; // Car starts in stopped state
    }

    // Method to start the car
    public void start() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("Starting the " + make + " " + model);
        } else {
            System.out.println("The car is already started.");
        }
    }

    // Method to stop the car
    public void stop() {
        if (isStarted) {
            isStarted = false;
            System.out.println("Stopping the " + make + " " + model);
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    // Method to display car's information
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Status: " + (isStarted ? "Started" : "Stopped"));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Display initial information
        myCar.displayInfo();

        // Start the car
        myCar.start();

        // Display updated information
        myCar.displayInfo();

        // Stop the car
        myCar.stop();

        // Display final information
        myCar.displayInfo();
    }
}
