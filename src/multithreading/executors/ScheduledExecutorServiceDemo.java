package multithreading.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        try {
            System.out.println("Scheduling tasks...");
            scheduledExecutorService.schedule(() -> {
                System.out.println("Task executed after delay");
            }, 5, TimeUnit.SECONDS);
        } catch (Exception e){
                System.out.println("Exception occurred: " + e.getMessage());
        }finally {
            scheduledExecutorService.shutdown();
            System.out.println("Scheduled Executor service shutdown");
        }
    }
}
