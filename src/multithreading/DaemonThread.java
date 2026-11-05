package multithreading;

/**
 * Compares the main thread, a normal worker thread, and a daemon thread.
 * 
 * A daemon thread runs independently but does not keep the JVM alive. The JVM
 * stays running while any non-daemon thread is alive; once all non-daemon
 * threads finish, the JVM may exit and stop any daemon threads still running.
 */
public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            int count = 1;
            while (true) {
                System.out.println("Daemon thread: working " + count++);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }, "daemon-worker");
        daemonThread.setDaemon(true);

        Thread normalThread = new Thread(() -> {
            for (int count = 1; count <= 5; count++) {
                System.out.println("Normal thread: working " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Normal thread: finished");
        }, "normal-worker");

        System.out.println("Main thread: starting both workers");
        daemonThread.start();
        normalThread.start();

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread: finished");
    }
}
