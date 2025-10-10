package lambda;

public class ThreadCreationDemo {
    public static void main(String[] args) {
        //using anonymous class
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Runnable1: "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread1=new Thread(runnable1);
        thread1.setName("Thread-1");
        thread1.start();

        //using lambda expression
        Runnable runnable2=()->{
          for(int i=1;i<=10;i++){
              System.out.println(2*i);
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread thread2=new Thread(runnable2);
        thread2.setName("Thread-2");
        thread2.start();
    }
}
