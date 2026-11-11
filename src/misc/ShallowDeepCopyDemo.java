package misc;

// A Person has a name and an Address.
// Shallow copy: new Person, same Address. Changing the copy's city changes the original too.
// Deep copy: new Person and a new Address. Changing the copy's city leaves the original alone.
public class ShallowDeepCopyDemo {

    public static void main(String[] args) {
        Person original = new Person("Asha", new Address("Pune"));
        Person shallow = original.shallowCopy();

        System.out.println("Shallow copy");
        print("before", original, shallow);
        shallow.address.city = "Mumbai";
        print("after copy city = Mumbai", original, shallow);

        System.out.println();

        Person another = new Person("Asha", new Address("Pune"));
        Person deep = another.deepCopy();

        System.out.println("Deep copy");
        print("before", another, deep);
        deep.address.city = "Delhi";
        print("after copy city = Delhi", another, deep);
    }

    static void print(String when, Person original, Person copy) {
        System.out.println(when);
        System.out.println("  original: " + original);
        System.out.println("  copy:     " + copy);
    }

    static class Address {
        String city;

        Address(String city) {
            this.city = city;
        }
    }

    static class Person {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        // New Person, same Address object.
        Person shallowCopy() {
            return new Person(name, address);
        }

        // New Person and a new Address object.
        Person deepCopy() {
            return new Person(name, new Address(address.city));
        }

        public String toString() {
            return name + ", " + address.city;
        }
    }
}
