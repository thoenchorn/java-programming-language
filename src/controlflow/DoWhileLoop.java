package controlflow;

import java.util.Scanner;

/**
 * Module 02: do-while loops with a simple menu.
 *
 * Run: ./scripts/run.sh controlflow.DoWhileLoop
 */
public class DoWhileLoop {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("1. Print \"Hello\"");
                System.out.println("2. Print \"World\"");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("Hello");
                    case 2 -> System.out.println("World");
                    case 3 -> System.out.println("Exiting.");
                    default -> System.out.println("Please choose 1, 2, or 3.");
                }
            } while (choice != 3);
        }
    }
}