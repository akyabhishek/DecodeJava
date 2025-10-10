package ref.constructor;

import java.util.List;

public class Streams {
    public static void main(String[] args) {

        List<Integer> ints=List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(ints);
        ints.forEach(System.out::println);
    }
}
