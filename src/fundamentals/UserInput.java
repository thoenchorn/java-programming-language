package fundamentals;

import java.util.Scanner;

/**
 * Module 01: reading user input with Scanner.
 *
 * Run: ./scripts/run.sh fundamentals.UserInput
 */
public class UserInput {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your height in meters: ");
            double height = scanner.nextDouble();

            System.out.print("Are you a student (true/false): ");
            boolean isStudent = scanner.nextBoolean();

            System.out.println();
            System.out.println("Name:     " + name);
            System.out.println("Age:      " + age);
            System.out.printf("Height:   %.2f m%n", height);
            System.out.println("Student:  " + isStudent);
        }
    }
}
