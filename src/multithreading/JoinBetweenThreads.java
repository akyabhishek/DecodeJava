package multithreading;

public class JoinBetweenThreads {

        public static void main(String[] args) {

            Thread t1 = new Thread(() -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread-1: " + i);
                    try { Thread.sleep(500); } catch (InterruptedException e) {}
                }
                System.out.println("Thread-1 finished.");
            });

            Thread t2 = new Thread(() -> {
                try {
                    t1.join(); // Thread-2 waits for Thread-1 to finish
                } catch (InterruptedException e) {}
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread-2: " + i);
                    try { Thread.sleep(500); } catch (InterruptedException e) {}
                }
                System.out.println("Thread-2 finished.");
            });

            t1.start();
            t2.start();
        }
    }

