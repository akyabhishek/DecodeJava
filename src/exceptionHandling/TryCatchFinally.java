package exceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] divisors = {1, 5, 2, 0, 5};
        for (int i = 0; i < arr.length; i++) {
            int result = divide(arr[i], divisors[i]);
            System.out.println("Result of " + arr[i] + " divided by " + divisors[i] + " is: " + result);
        }

    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            return -1;
        } finally {
            System.out.println("Execution of divide method completed.");
        }
    }
}
