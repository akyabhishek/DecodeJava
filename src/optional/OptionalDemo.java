package optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String str="Abhishek";

        //if value is null then it will throw NullPointerException
        Optional<String> optional= Optional.of(str);
        System.out.println(optional.get());
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());


        //if value is null then it will not throw NullPointerException

         Optional<String> optional2= Optional.of(str);
        System.out.println(optional2.get());
        System.out.println(optional2.isPresent());
        System.out.println(optional2.isEmpty());
    }
}
