package streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        toList();
        toSet();
        joining();
        toMap();


    }

    private static void toMap() {
        System.out.println("toMap() method of Collectors class");
        String[] names = {"Alice","Bob","Chandu"};

        // Collecting names into a map where key is the name and value is the length of the name
        Map<String, Integer> namesMap = Arrays.stream(names)
                .collect(Collectors.toMap(name -> name, name -> name.length()));

        System.out.println(namesMap);
    }

    private static void toSet() {
        System.out.println("toSet() method of Collectors class");
        String[] names = {"A","B","C","C"};

        Set<String> namesList=Arrays.stream(names).collect(Collectors.toSet());
        System.out.println(namesList);
    }

    public static void toList(){
        System.out.println("toList() method of Collectors class");
        String[] names = {"A","B","C"};

        List<String> namesList=Arrays.stream(names).collect(Collectors.toList());
        System.out.println(namesList);
    }
    public static void joining(){
        System.out.println("joining() method of Collectors class");
        // Example of using Collectors in Java Streams
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Collecting names into a single string separated by commas
        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Names: " + result);
    }
}
