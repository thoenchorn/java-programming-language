package generics;

import java.util.List;

/**
 * Module 09: generics provide compile-time type safety and code reuse.
 */
public class GenericBoxDemo {

    public static void main(String[] args) {
        Box<String> textBox = new Box<>("Hello");
        Box<Integer> numberBox = new Box<>(42);

        System.out.println("Text: " + textBox.get());
        System.out.println("Number: " + numberBox.get());

        Pair<String, Integer> student = new Pair<>("Dara", 18);
        System.out.println(student.first() + " is " + student.second());

        List<Integer> scores = List.of(90, 85, 100);
        List<Double> prices = List.of(1.5, 2.5, 3.0);
        System.out.println("Score total: " + sum(scores));
        System.out.println("Price total: " + sum(prices));
    }

    /** Upper-bounded wildcard: accepts a list of any Number subtype. */
    static double sum(List<? extends Number> numbers) {
        double total = 0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    static class Box<T> {
        private final T value;

        Box(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }
    }

    record Pair<A, B>(A first, B second) {
    }
}
