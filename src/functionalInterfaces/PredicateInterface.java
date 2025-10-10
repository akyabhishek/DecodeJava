package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven=num->num%2==0;
        Predicate<Integer> isPositive=n->n>0;

        System.out.println(isEven.test(3));
        System.out.println(isEven.and(isPositive).test(2));
        System.out.println(isEven.and(isPositive).test(-3));
        System.out.println(isEven.negate().test(-3));

    }
}
