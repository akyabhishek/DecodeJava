package multithreading.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    public int balance=100;

    public Lock lock =new ReentrantLock();

    public synchronized void withdrawWithoutLock(int amount){
        System.out.println(Thread.currentThread().getName() +" Going to withdraw...");
        try {
                Thread.sleep(3000);
                if (balance>=amount){
                        System.out.println(Thread.currentThread().getName() +" Withdrawn: "+ amount);
                        balance=balance - amount;
                        System.out.println(Thread.currentThread().getName() +" Remaining Balance: "+ balance);
                }else {
                        System.out.println(Thread.currentThread().getName() +" Insufficient Balance! ");
                }
        }catch (InterruptedException e){
                e.printStackTrace();
        }
    }

    public void withdraw(int amount){
        System.out.println("" +Thread.currentThread().getName() +" Going to withdraw...");
        try{
            if(lock.tryLock(1, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName() +" Acquired the lock...");
                try {
                    Thread.sleep(3000);
                    if (balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " Withdrawn: " + amount);
                        balance = balance - amount;
                        System.out.println(Thread.currentThread().getName() + " Remaining Balance: " + balance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " Insufficient Balance! ");
                    }

                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println(Thread.currentThread().getName() +" Could not acquire the lock, exiting...");
                return;
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
