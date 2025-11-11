package multithreading.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            Future<?> future = executorService.submit(() -> {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }); // runnable parameter
            System.out.println("Future is cancelled before cancellation:" + future.isCancelled());
            future.cancel(true);
            System.out.println("Future is cancelled after cancellation:" + future.isCancelled());
            // Even after cancellation we can check isDone, and it will return true
            //  because task is either completed or cancelled
            System.out.println("Is future done? :" + future.isDone());
            System.out.println(future.get()); // blocking call ( null )
            if (future.isDone()) {
                System.out.println("Task is done !");
            }

        }catch (Exception e){
            System.out.println("Exception occurred: "+e.getMessage());
        }finally {
            executorService.shutdown();
            System.out.println("Executor service shutdown");
        }

    }
}
