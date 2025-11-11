package multithreading.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduledExecutorServiceDemoFixed {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        try {
            System.out.println("Scheduling tasks...");


             scheduledExecutorService.scheduleAtFixedRate(() -> {
                System.out.println("Task executed after 5 second delay");
            }, 5, 5, java.util.concurrent.TimeUnit.SECONDS);


             scheduledExecutorService.scheduleWithFixedDelay(()-> {
                System.out.println("Task executed with 3 seconds delay after previous completion");
                }, 0, 3, java.util.concurrent.TimeUnit.SECONDS);

            scheduledExecutorService.schedule(() -> {
                System.out.println("Shutting down the scheduler");
                scheduledExecutorService.shutdown();
            }, 20, java.util.concurrent.TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
