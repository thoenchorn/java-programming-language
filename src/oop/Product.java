package oop;

/**
 * Overloaded constructors give a product a sensible default price.
 */
public class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name) {
        this(id, name, 0.0);
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.printf("Product #%d: %s - $%.2f%n", id, name, price);
    }
}
