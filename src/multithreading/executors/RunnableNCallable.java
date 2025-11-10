package multithreading.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableNCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> {
            System.out.println("Runnable Task is running");
        };
        Callable<String> task2 = () -> {
            return "Callable Task is completed";
        };
        executorService.submit(task1);
        try {
            String result = executorService.submit(task2).get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }
}
