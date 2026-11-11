
package misc;

public class VariableArguments {

    public static void main(String[] args) {

        System.out.println("Variable Arguments Demo");

        // Rule 1: You can pass any number of arguments, including zero.
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 1, 2, 3, 4, 5: " + sum(1, 2, 3, 4, 5));
        System.out.println("Sum of no numbers: " + sum());

        // Rule 2: You can also pass an existing array.
        int[] arr = {10, 20, 30};
        System.out.println("Sum of array elements: " + sum(arr));

        // Rule 3: Varargs can be combined with regular parameters.
        printNumbers("Numbers", 1, 2, 3, 4);
    }

    /*
     * VARARGS (Variable Arguments)
     *
     * Allows a method to accept a variable number of arguments.
     *
     * Internally, Java treats varargs as an array.
     *
     * sum(1, 2, 3) -> numbers = [1, 2, 3]
     * sum(1, 2)    -> numbers = [1, 2]
     * sum()        -> numbers = []
     */
    public static int sum(int... numbers) {

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }

    /*
     * VARARGS RULES:
     *
     * 1. Only ONE varargs parameter is allowed per method.
     *
     *    Valid:   void demo(int... nums)
     *    Invalid: void demo(int... nums, String... names)
     *
     * 2. Varargs must ALWAYS be the last parameter.
     *
     *    Valid:   void demo(String name, int... nums)
     *    Invalid: void demo(int... nums, String name)
     *
     * 3. Varargs can accept ZERO or MORE arguments.
     *
     *    demo()
     *    demo(10)
     *    demo(10, 20, 30)
     *
     * 4. You can pass an existing array to a varargs parameter.
     *
     *    int[] arr = {1, 2, 3};
     *    demo(arr);
     *
     * 5. Varargs is internally treated as an array.
     *
     *    int... nums is equivalent to int[] nums
     *
     * 6. A method cannot declare both int[] and int... parameters
     *    with the same method signature because they have the
     *    same underlying parameter type.
     *
     * 7. Regular parameters can appear before varargs, but not after it.
     *
     *    Valid: void demo(String name, int... nums)
     */

    // Example: Regular parameter followed by varargs
    public static void printNumbers(String message, int... numbers) {

        System.out.println(message);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
