package oop;

/**
 * A motorcycle with encapsulated fields.
 */
public class Moto {
    private String color;
    private String model;
    private String brand;
    private int year;
    private double price;

    public Moto(String color, String model, String brand, int year, double price) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.printf("Moto: %s %s (%s, %d) - $%.2f%n",
                brand, model, color, year, price);
    }

    public void accelerate(int speed) {
        System.out.println("The moto accelerates to " + speed + " km/h.");
    }
}
