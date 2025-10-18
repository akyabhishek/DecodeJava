package multithreading;

public class MyThreadByClass extends Thread {

    /**
     * The entry point for the thread. This method is executed when the thread is started.
     * It prints a message indicating that the thread is running.
     */
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("MyThreadByClass is running: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
