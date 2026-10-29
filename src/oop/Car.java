package oop;

/**
 * A car with instance fields and one static field.
 */
public class Car {
    private String brand;
    private String model;
    private String color;
    private double price;

    public static final int WHEEL_COUNT = 4;

    public Car(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.printf("%s %s (%s) - $%.2f, %d wheels%n",
                brand, model, color, price, WHEEL_COUNT);
    }
}
