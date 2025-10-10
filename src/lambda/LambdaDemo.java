package lambda;

public class LambdaDemo {

    public static void main(String[] args) {

        //Functional Interface Implementation
        FuncInter funcInter = new FuncInterImp();
        funcInter.sayHello();

        //Anonymous Class Implementation
        FuncInter funcInter1 = new FuncInter() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class Implementation");
            }
        };
        funcInter1.sayHello();

        //Lambda Expression Implementation
        FuncInter funcInter2 = () -> System.out.println("Hello from Lambda Expression Implementation");
        funcInter2.sayHello();

        //Sum Interface Implementation using Lambda Expression
        //no need to define type of parameters
        SumInter sumInter = (a, b) -> a + b;
        int result = sumInter.sum(5, 10);
        System.out.println("Sum from Lambda Expression Implementation: " + result);
    }
}
