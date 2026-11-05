package exceptionHandling;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            test();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static  void test() throws ClassNotFoundException{
        System.out.println("Inside test method");
        Class.forName("java.lang.String");
    }
}
