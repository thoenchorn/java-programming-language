package oop;

/**
 * A simple encapsulated book.
 */
public class Book {
    private String title;
    private double price;
    private String code;

    public Book() {
        this("Untitled", 0.0, "N/A");
    }

    public Book(String title, double price, String code) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.title = title;
        this.price = price;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void displayDetails() {
        System.out.printf("Book: %s | Price: $%.2f | Code: %s%n", title, price, code);
    }
}
