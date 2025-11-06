package lambda;

public class ThreadCreationLambdaDemo {
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

        Thread thread3= new Thread(()-> System.out.println("Hello from Thread-3"));
        thread3.setName("Thread-3");
        thread3.start();

        Thread thread4=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread-4: "+i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread4.setName("Thread-4");
        thread4.start();
    }
}
