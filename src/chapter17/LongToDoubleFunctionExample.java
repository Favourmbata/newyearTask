package chapter17;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionExample {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = value-> value/ 2;

        System.out.println(longToDoubleFunction.applyAsDouble(3));

    }
}
