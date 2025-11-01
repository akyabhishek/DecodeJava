package multithreading.locks;

public class LockDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Runnable task = () -> account.withdraw(50);
        Thread t1 = new Thread(task, "Customer-1");
        Thread t2 = new Thread(task, "Customer-2");
        t1.start();
        t2.start();
    }
}
