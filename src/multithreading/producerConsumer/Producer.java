package multithreading.producerConsumer;

public class Producer extends Thread{
    Company company;
    public Producer(Company company){
        this.company=company;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                company.produceItem(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
