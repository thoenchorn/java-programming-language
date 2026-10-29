package oop;

/**
 * Demonstrates fields, constructors, getters, setters, and behavior.
 */
public class Computer {
    private String brand;
    private String model;
    private int year;
    private boolean isNew;

    public Computer() {
        this("Unknown", "Unknown", 0, false);
    }

    public Computer(String brand, String model, int year, boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isNew = isNew;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("New: " + isNew);
    }
}
