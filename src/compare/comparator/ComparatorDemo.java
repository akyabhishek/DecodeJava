package compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"John",50000));
        employees.add(new Employee(3,"Alice",7000));
        employees.add(new Employee(2,"Bob",8000));
        System.out.println("Before Sorting");
        System.out.println(employees);

        ArrayList<Employee> employees1=new ArrayList<>(employees);

        Collections.sort(employees,new IdComparator());
        System.out.println("After Sorting with IdComparator");
        System.out.println(employees);

        Collections.sort(employees,new SalaryComparator());
        System.out.println("After Sorting with SalaryComparator");
        System.out.println(employees);

        // Using Anonymous Class
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("After Sorting with NameComparator with Anonymous Class");
        System.out.println(employees);

        //using lambda expression
        Collections.sort(employees1, (o1, o2) -> o1.getId()- o2.getId());
        System.out.println("After Sorting with IDComparator with Lambda Expression");
        System.out.println(employees1);

    }
}
