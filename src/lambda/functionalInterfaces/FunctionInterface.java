package lambda.functionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer,Integer> square=(n)->n*n;
        System.out.println("apply():"+square.apply(5));

        Function<Integer,Integer> doubleVal=n->2*n;
        System.out.println("square.andThen(doubleVal):"+square.andThen(doubleVal).apply(5));

        System.out.println("square.compose(doubleVal):"+square.compose(doubleVal).apply(5));

        Function<String, String> identityFunc=Function.identity();
        System.out.println("identity():"+identityFunc.apply("Abhishek"));
    }
}
