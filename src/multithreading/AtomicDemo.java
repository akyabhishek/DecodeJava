package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicDemo ac = new AtomicDemo();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                ac.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                ac.increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final counter value:" + ac.getCount());
    }
}
