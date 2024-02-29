package chapter17;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionExample {
    public static void main(String[] args) {
        UnaryOperator<String> operator = (word)-> new StringBuilder(word).reverse().toString();
        System.out.println(operator.apply("Hello"));
    }
}
