package ref;

public class Task{
    public static void doTask(){
        System.out.println("Task is being done");
    }

    public static void threadTask(){
        for(int i=0;i<5;i++){
            System.out.println("Thread task "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void printTable(){
        for(int i=1;i<=5;i++){
            System.out.println("5 x "+i+" = "+(5*i));
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
