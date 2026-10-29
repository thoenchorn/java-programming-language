package abstraction;

/**
 * An abstract class represents a generic concept that cannot be instantiated on
 * its own.
 * It serves as a blueprint for other classes.
 */
public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method: Hidden implementation details
    // Every vehicle moves differently, so we leave it to subclasses to decide HOW.
    public abstract void startEngine();

    public abstract void accelerate();

    // Concrete method: Common functionality shared by all vehicles
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
