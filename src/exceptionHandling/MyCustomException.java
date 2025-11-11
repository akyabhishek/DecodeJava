package exceptionHandling;

public class MyCustomException extends  Exception{
    public MyCustomException(String message) {
        super("This is a custom exception with message :"+message);
    }
}
