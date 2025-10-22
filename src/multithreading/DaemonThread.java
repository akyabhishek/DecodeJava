package multithreading;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("Daemon Thread is running...");
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start();

        try {
            Thread.sleep(500); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread is ending...");
    }
}
