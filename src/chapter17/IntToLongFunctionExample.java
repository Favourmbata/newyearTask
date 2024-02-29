package chapter17;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionExample {
    public static void main(String[] args) {
        IntToLongFunction  intToLongFunction =  value-> (long) value * value;

        System.out.println(intToLongFunction.applyAsLong(3));
    }
}
