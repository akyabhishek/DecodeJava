package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        //filter takes a Predicate and returns a stream
        List<Integer> even=list.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(even);

        //map takes a Function and returns a stream
        List<Integer> squares=list.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println(squares);

        //forEach takes a Consumer and returns void
        list.stream().forEach(System.out::println);


        //sorted takes Comparator and returns stream
        List<Integer> sorted=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}

