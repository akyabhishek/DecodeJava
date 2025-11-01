package multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    // ReentrantLock allows the same thread to acquire the lock multiple times
    // Additionally, it provides more flexibility than synchronized blocks/methods

    //Unfair lock by default - doesn't guarantee the order of lock acquisition. Starvation possible.
    Lock lock = new ReentrantLock();

    // Fair lock - grants access to the longest-waiting thread. Starvation is prevented.
    //Lock lock = new ReentrantLock(true);
    public void outerMethod() {
        try {
            // Acquiring the lock for the first time
            lock.lock();
            System.out.println("In outer method");
            innerMethod();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("Outer method completed");
            // Releasing the lock for the outer method call
            lock.unlock();
        }
    }

    private void innerMethod() {
        try {
            // Acquiring the lock for the second time on same thread
            lock.lock();
            System.out.println("In inner method");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("Inner method completed");
            // Releasing the lock for the inner method call
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo demo = new ReentrantLockDemo();
        demo.outerMethod();
    }
}
