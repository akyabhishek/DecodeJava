package exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] divisors = {1,5,2,0,5};
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println("Result: " + (arr[i] / divisors[i]));
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }
}
