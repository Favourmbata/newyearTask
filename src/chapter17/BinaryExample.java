package chapter17;

import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (word , word2)-> new StringBuilder(word).substring(4).toString();
        System.out.println(binaryOperator.apply("marvelous" ,"marv"));
    }
}
