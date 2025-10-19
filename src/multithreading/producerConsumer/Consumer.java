package multithreading.producerConsumer;

public class Consumer extends Thread{
    Company company;
    public Consumer(Company company){
        this.company=company;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                company.consumeItem(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
