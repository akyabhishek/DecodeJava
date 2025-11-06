package multithreading;

/**
 * Demonstrates the use of a daemon thread in Java.
 * <p>
 * A daemon thread runs in the background and does not prevent the JVM from exiting when the main thread finishes.
 * This class creates a thread that continuously prints a message, and sets it as a daemon.
 * The main thread sleeps for a short duration and then ends, causing the JVM to terminate the daemon thread.
 */
public class DaemonThread extends Thread {
    /**
     * The entry point for the daemon thread.
     * Continuously prints a message to indicate it is running.
     */
    @Override
    public void run() {
        while(true){
            System.out.println("Daemon Thread is running...");
        }
    }

    /**
     * Main method to demonstrate daemon thread behavior.
     * Creates and starts a daemon thread, then sleeps for 500ms before ending.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start();

        try {
            Thread.sleep(500); // Main thread sleeps for 500 milliseconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread is ending...");
    }
}
