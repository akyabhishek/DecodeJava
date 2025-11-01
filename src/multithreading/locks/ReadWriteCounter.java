package multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;

    // ReadWriteLock allows multiple threads to read a resource concurrently, but only one to write at a time.
    // This improves performance in scenarios with frequent reads and infrequent writes.
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock(); // ReentrantReadWriteLock is a concrete implementation supporting reentrancy.

    // The readLock allows multiple threads to acquire the lock simultaneously for reading, as long as no thread holds the writeLock.
    private final Lock readLock = rwLock.readLock();

    // The writeLock allows only one thread to acquire the lock for writing, blocking all other readers and writers until released.
    private final Lock writeLock = rwLock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Incrementing Count to: " + count);

            // Simulate some write operation delay, meanwhile readers will be blocked.
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();

        // Writer thread
        Runnable writerTask = () -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " - Incremented Count to (main): " + counter.getCount());
            }
        };

        // Reader thread
        Runnable readerTask = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + counter.getCount());

            }
        };

        Thread writerThread = new Thread(writerTask, "Writer-Thread");
        Thread readerThread1 = new Thread(readerTask, "Reader-Thread-1");
        Thread readerThread2 = new Thread(readerTask, "Reader-Thread-2");

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();
        readerThread1.join();
        readerThread2.join();
        System.out.println("Final Count: " + counter.getCount());
    }
}
