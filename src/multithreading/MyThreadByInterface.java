package multithreading;

public class MyThreadByInterface implements  Runnable{
    @Override
    public void run() {
       for(int i = 0; i < 100; i++) {
           System.out.println("MyThreadByInterface is running: " + i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               System.out.println("Thread interrupted: " + e.getMessage());
           }
       }
    }
}
