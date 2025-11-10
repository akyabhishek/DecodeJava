package multithreading.executors;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

public class CallableWithInvokeAll {
    public static void main(String[] args) {
        Callable<String> c1=()->{
            Thread.sleep(1000);
            return "Callable Task 1 Completed";
        };
        Callable<String> c2=()->{
            Thread.sleep(1000);
            return "Callable Task 2 Completed";
        };
        Callable<String> c3=()->{
            Thread.sleep(1000);
            return "Callable Task 3 Completed";
        };
        var executorService=java.util.concurrent.Executors.newFixedThreadPool(2);
        List<Callable<String>> callables=List.of(c1,c2,c3);
        try {

            // Invoke all callables, blocking until all are complete
            var futures=executorService.invokeAll(callables, 1,TimeUnit.SECONDS);
            for(var future:futures){
                System.out.println("Future isDone: "+future.isDone());
                System.out.println(future.get());
                System.out.println("Future isDone after get: "+future.isDone());

            }

        } catch (CancellationException e){
            System.out.println("A task was cancelled: " + e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            executorService.shutdown();
            // Await termination to ensure all tasks are completed
            System.out.println("All tasks submitted.");
        }
    }
}
