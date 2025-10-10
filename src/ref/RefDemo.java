package ref;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Method reference demo");

        //Implementation of TaskInter
        TaskInter taskInter=()->{
            System.out.println("Task is being done by lambda");
        };

        taskInter.doTask1();

        //Static Method reference
        //ClassName::MethodName without parenthesis
        TaskInter taskInter1=Task::doTask;
        taskInter1.doTask1();

        //Thread using static method reference
        Runnable runnable=Task::threadTask;
        Thread thread=new Thread(runnable);
        thread.start();

        //Non-static method reference
        //object::MethodName without parenthesis
        Task task=new Task();
        Runnable runnable1=task::printTable;
        Thread thread1=new Thread(runnable1);
        thread1.start();

    }
}
