package multithreading;

public class ThreadPriorityMethod extends Thread {
    public ThreadPriorityMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is Running...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadPriorityMethod l = new ThreadPriorityMethod("Low Priority Thread");
        ThreadPriorityMethod m = new ThreadPriorityMethod("Medium Priority Thread");
        ThreadPriorityMethod n = new ThreadPriorityMethod("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();

    }
}