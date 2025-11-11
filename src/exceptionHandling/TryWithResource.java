package exceptionHandling;

import java.io.FileReader;

public class TryWithResource {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the resource
        try (FileReader resource = new FileReader("non_existent_file.txt")) {
            resource.ready();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        /*
         * In case of not using try-with-resources, the code would look like this:
         * FileReader resource = null;
         * try {
         *   resource = new FileReader("non_existent_file.txt");
         *  resource.ready();
         * } catch (Exception e) {
         *   System.out.println("Caught exception: " + e.getMessage());
         * } finally {
         * resource.close();
         * }
         *
         * */
    }
}
