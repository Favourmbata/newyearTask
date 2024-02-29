package chapter17;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String,String ,String> biFunction = (word1, word2) -> word1 + word2;
        System.out.println(biFunction.apply("hello", "world"));

//        BiFunction<Integer,Integer ,Integer> biFunction = (number1,number2)->  number1 + number2;
//       System.out.println(biFunction.apply(7,5));
    }
}
