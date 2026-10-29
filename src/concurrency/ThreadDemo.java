package concurrency;

/**
 * Module 12: creating threads with Runnable and waiting with join().
 */
public class ThreadDemo {

    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            for (int task = 1; task <= 3; task++) {
                System.out.println(Thread.currentThread().getName() + " is doing task " + task);
                sleep(300);
            }
        }, "worker-1");

        System.out.println("Main starts " + worker.getName());
        worker.start();

        try {
            worker.join(); // wait for the worker to finish
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Main finished");
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}
