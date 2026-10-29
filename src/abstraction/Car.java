package abstraction;

/**
 * Car is a "concrete" class because it provides actual implementations
 * for the abstract methods defined in Vehicle.
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("The " + getBrand() + " " + getModel() + " starts with a key ignition.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating using the gas pedal.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Doors: " + numberOfDoors);
    }
}
