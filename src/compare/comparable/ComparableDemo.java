package compare.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Alice", 60000));
        employees.add(new Employee(112, "Bob", 55000));
        employees.add(new Employee(103, "Charlie", 70000));
        employees.add(new Employee(14, "David", 50000));

        System.out.println("Before Sorting:");
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println("After Sorting:");
        System.out.println(employees);
    }
}
