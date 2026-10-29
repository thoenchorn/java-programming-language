package projects.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import oop.Book;

/**
 * Module 14: a small library catalog that combines classes, collections,
 * sorting, and command-line arguments.
 *
 * Run with titles:
 *   ./scripts/run.sh projects.library.LibraryApp "Clean Code" "Effective Java"
 */
public class LibraryApp {

    public static void main(String[] args) {
        List<Book> catalog = buildCatalog(args);

        catalog.sort(Comparator.comparing(Book::getTitle));
        System.out.println("=== Library Catalog (" + catalog.size() + " books) ===");
        for (Book book : catalog) {
            book.displayDetails();
        }

        long premiumCount = catalog.stream()
                .filter(book -> book.getPrice() >= 15.0)
                .count();
        System.out.println("Books priced $15 or more: " + premiumCount);
    }

    private static List<Book> buildCatalog(String[] titles) {
        List<Book> books = new ArrayList<>();

        if (titles.length == 0) {
            books.add(new Book("Clean Code", 32.50, "B-001"));
            books.add(new Book("Effective Java", 45.00, "B-002"));
            books.add(new Book("Java: The Complete Reference", 55.75, "B-003"));
            return books;
        }

        for (int index = 0; index < titles.length; index++) {
            books.add(new Book(titles[index], 19.99 + index * 5.0, "B-" + (index + 1)));
        }
        return books;
    }
}
