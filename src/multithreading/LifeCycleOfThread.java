package multithreading;

public class LifeCycleOfThread extends  Thread{
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<5;i++){
            System.out.println("Thread is getting executed with count "+(i+1));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycleOfThread thread=new LifeCycleOfThread();
        System.out.println("Thread state before start():"+thread.getState());
        thread.start();
        System.out.println("Thread state after start():"+thread.getState());
        Thread.sleep(1000);
        System.out.println("Thread state when put on sleep:"+thread.getState());
        thread.join();
        System.out.println("State after execution:"+thread.getState());
    }
}
