package misc;


public class ImmutableClass {
    private final String name;
    private final int age;

    //Immutable Class only has parameterized constructor without any setter methods
    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        //Immutable object creation with constructor
        ImmutableClass obj = new ImmutableClass("Alice", 30);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
