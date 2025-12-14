package misc;

public class AbstractClassDemo {
    public static void main(String[] args) {
       //Abstract class cannot be instantiated directly
        //AbstractClass myObject = new AbstractClass();

        ChildClass cc=new ChildClass();
        cc.abstractMethod();
    }
}
