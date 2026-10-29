package controlflow;

import java.util.Scanner;

/**
 * Module 02: if/else statements and for loops.
 *
 * Run: ./scripts/run.sh controlflow.ControlStatement
 */
public class ControlStatement {

    public static void main(String[] args) {
        printNameTenTimes("Thoen");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int first = input.nextInt();
            System.out.print("Enter number 2: ");
            int second = input.nextInt();
            compare(first, second);

            System.out.print("Enter a number to check even/odd: ");
            int number = input.nextInt();
            System.out.println(number + " is " + (isEven(number) ? "even" : "odd"));

            System.out.print("Enter a positive value N: ");
            int n = input.nextInt();
            System.out.println("The sum from 1 to " + n + " is " + sumTo(n));
        }
    }

    private static void printNameTenTimes(String name) {
        System.out.println("------------- print name -------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }
    }

    private static void compare(int first, int second) {
        if (first == second) {
            System.out.println("Number 1 == Number 2");
        } else if (first > second) {
            System.out.println("Number 1 > Number 2");
        } else {
            System.out.println("Number 1 < Number 2");
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int sumTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
