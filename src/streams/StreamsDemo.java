package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);

//        Stream<Integer> stream=numbers.stream();
        List<Integer> newList=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1=numbers.stream().filter(num->num>5).collect(Collectors.toList());
        System.out.println(newList1);

        //stream with array
        String names[]={"Abhishek","John","Alice","Bob"};
        List<String> namesList= Stream.of(names).filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesList);

    }
}
