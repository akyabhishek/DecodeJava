package exceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] divisors = {1, 5, 0, 2};
        for (int i = 0; i < arr.length; i++) {
            int result = divide(arr, divisors, i);
            System.out.println("Result of " + arr[i] + " divided by " + (i < divisors.length ? divisors[i] : "N/A") + " is: " + result);

            int resultMultiCatch = divideMultiCatch(arr, divisors, i);
            System.out.println("Result (Multi-Catch) of " + arr[i] + " divided by " + (i < divisors.length ? divisors[i] : "N/A") + " is: " + resultMultiCatch);
        }
    }

    public static int divide(int[] a, int[] b, int index) {
        try {
            return a[index] / b[index];
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero at index " + index + ".");
            return -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for divisors array.");
            return -1;
        }
    }

    public static int divideMultiCatch(int[] a, int[] b, int index) {
        try {
            return a[index] / b[index];
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage() + " at index " + index + ".");
            return -1;
        }
    }
}
