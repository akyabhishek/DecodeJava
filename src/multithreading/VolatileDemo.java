package multithreading;

public class VolatileDemo {
    public class SharedObj {
        volatile boolean flag = false;

        public void makeFlagTrue() {
            System.out.println("Making flag true");
            flag = true;
            System.out.println("Flag is now true");
        }

        public void waitForFlag() {
            System.out.println("Waiting for flag to become true");
            while (!flag) {
                // busy-wait
            }
            System.out.println("Flag is true, exiting wait");
        }
    }

    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        SharedObj sharedObj = demo.new SharedObj();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Sleep for 2 seconds before setting flag
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedObj.makeFlagTrue();
        });

        Thread readerThread = new Thread(() -> {
            sharedObj.waitForFlag();
        });

        readerThread.start();
        writerThread.start();

        try {
            readerThread.join();
            writerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread exiting");
    }
}
