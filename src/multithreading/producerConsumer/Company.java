package multithreading.producerConsumer;

public class Company {
    int n;
    boolean f=false;
    synchronized public void produceItem(int i) throws InterruptedException {
        if(f){
            wait();
        }
        this.n=i;
        System.out.println("Produced -"+n);
        f=true;
        notify();
    }
    synchronized public int consumeItem(int i) throws InterruptedException {
        if(!f){
            wait();
        }
        this.n=i;
        System.out.println("Consumed -"+n);
        f=false;
        notify();
        return this.n;
    }
}
