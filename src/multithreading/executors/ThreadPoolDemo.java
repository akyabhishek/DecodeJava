package multithreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i=1;i<=10;i++){
            final int number=i;
            executorService.submit(()->{
                int result=factorial(number);
                System.out.println("Factorial of "+number+" is: "+result);
            });
        }

        System.out.println("Is terminated: "+executorService.isTerminated());
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("All tasks submitted.");
        System.out.println("Is terminated: "+executorService.isTerminated());
        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken: " + (endTime - startTime) + " ms");

    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
