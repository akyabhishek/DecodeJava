package misc;

public abstract class AbstractClass {
    //Constructor
    public AbstractClass() {
        System.out.println("AbstractClass constructor called.");
    }
    // Abstract method (does not have a body)
    public abstract void abstractMethod();

    // Regular method
    public void regularMethod() {
        System.out.println("This is a regular method in the abstract class.");
    }
}
