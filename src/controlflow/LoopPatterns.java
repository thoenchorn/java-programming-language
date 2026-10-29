package controlflow;

/**
 * Module 02: while, for, break, and continue.
 */
public class LoopPatterns {

    public static void main(String[] args) {
        countdown(5);
        multiplicationTable(3);
        printOddNumbers(10);
    }

    private static void countdown(int start) {
        System.out.println("Countdown:");
        int current = start;
        while (current > 0) {
            System.out.print(current + " ");
            current--;
        }
        System.out.println("Liftoff!");
    }

    private static void multiplicationTable(int number) {
        System.out.println("\n" + number + " times table:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }

    private static void printOddNumbers(int limit) {
        System.out.println("\nOdd numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            if (i > 9) {
                break; // stop after 9 for demonstration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
