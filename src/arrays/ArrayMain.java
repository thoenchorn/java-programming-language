package arrays;

import java.util.Arrays;

/**
 * Module 04: array traversal, aggregation, and in-place reversal.
 *
 * Run: ./scripts/run.sh arrays.ArrayMain
 */
public class ArrayMain {

    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 6, 7 };

        System.out.println("--- Array detail ---");
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Max: " + max(numbers));
        System.out.println("Min: " + min(numbers));

        reverse(numbers);
        System.out.println("Reversed: " + Arrays.toString(numbers));
    }

    static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    static double average(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot average an empty array");
        }
        return (double) sum(numbers) / numbers.length;
    }

    static int min(int[] numbers) {
        requireNotEmpty(numbers);
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    static int max(int[] numbers) {
        requireNotEmpty(numbers);
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    static void reverse(int[] numbers) {
        if (numbers == null) {
            return;
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    private static void requireNotEmpty(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }
}