package exceptionHandling;

public class CustomException {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
