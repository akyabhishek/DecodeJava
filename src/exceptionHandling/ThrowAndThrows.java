package exceptionHandling;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception in main: " + e.getMessage());
            throw new Exception("Rethrowing exception from main method.", e);
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
