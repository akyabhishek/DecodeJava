package multithreading;

public class MyThreadDemo {
    public static void main(String[] args) {
        // Creating a thread by extending the Thread class
        MyThreadByClass threadByClass = new MyThreadByClass();
        threadByClass.start();

        // Creating a thread by implementing the Runnable interface
        MyThreadByInterface runnable = new MyThreadByInterface();
        Thread threadByInterface = new Thread(runnable);
        threadByInterface.start();
    }
}
