package functionalInterfaces;
import java.util.function.Consumer;


public class ConsumerInterface {
    public static void main(String[] args) {
        //
        Consumer<String> printUpper=(str)-> System.out.println(str.toUpperCase());
        Consumer<String> printLower=str-> System.out.println(str.toLowerCase());

        printUpper.andThen(printLower).accept("AbHiShEk");
    }
}
