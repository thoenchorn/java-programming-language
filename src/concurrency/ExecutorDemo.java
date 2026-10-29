package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Module 12: running tasks on a thread pool and collecting results.
 */
public class ExecutorDemo {

    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            Future<Integer> first = executor.submit(() -> square(6));
            Future<Integer> second = executor.submit(() -> square(9));

            try {
                System.out.println("6 squared = " + first.get());
                System.out.println("9 squared = " + second.get());
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException exception) {
                System.out.println("Task failed: " + exception.getCause().getMessage());
            }
        }
        System.out.println("Executor shut down");
    }

    private static int square(int number) {
        return number * number;
    }
}
