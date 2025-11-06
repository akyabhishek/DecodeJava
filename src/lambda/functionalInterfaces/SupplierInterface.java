package lambda.functionalInterfaces;


import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Double> randomeSupplier=()->Math.random();
        System.out.println(randomeSupplier.get());
        System.out.println(randomeSupplier.get());
    }
}
