package multithreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates the usage and differences between Fixed and Cached Thread Pools in Java.
 *
 * Thread pools manage a pool of worker threads, reducing the overhead of thread creation
 * and destruction, improving application performance.
 */
public class FixedCachedThreadPool {
    public static void main(String[] args) {
        demonstrateFixedThreadPool();
        System.out.println("\n-------------------\n");
        demonstrateCachedThreadPool();
    }

    /**
     * Fixed Thread Pool:
     * - Creates a thread pool with a fixed number of threads
     * - If all threads are busy, new tasks wait in a queue
     * - Good for: CPU-intensive tasks, controlling resource usage
     * - Threads remain in pool even when idle
     */
    private static void demonstrateFixedThreadPool() {
        System.out.println("Fixed Thread Pool Demo:");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        try {
            // Submit 5 tasks to a pool of 3 threads
            for (int i = 1; i <= 5; i++) {
                final int taskId = i;
                fixedThreadPool.submit(() -> {
                    System.out.println("Fixed Pool Task " + taskId + " executing on thread: "
                            + Thread.currentThread().getName());
                    try {
                        // Simulate some work
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return null;
                });
            }

            // Proper shutdown
            fixedThreadPool.shutdown();
            fixedThreadPool.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Cached Thread Pool:
     * - Creates new threads as needed and reuses idle threads
     * - Threads that remain idle for 60 seconds are terminated
     * - Good for: Many short-lived asynchronous tasks
     * - Provides better resource management for varying loads
     */
    private static void demonstrateCachedThreadPool() {
        System.out.println("Cached Thread Pool Demo:");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        try {
            // Submit 10 tasks in quick succession
            for (int i = 1; i <= 10; i++) {
                final int taskId = i;
                cachedThreadPool.submit(() -> {
                    System.out.println("Cached Pool Task " + taskId + " executing on thread: "
                            + Thread.currentThread().getName());
                    try {
                        // Simulate varying workloads
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return null;
                });
            }

            // Proper shutdown
            cachedThreadPool.shutdown();
            cachedThreadPool.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
