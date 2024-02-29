package chapter17;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
//        Function<String,Integer> function =  (word)-> word.length();
//        System.out.println(function.apply("girl"));

   Function<String,String> function = (word)-> word.substring(4);
        System.out.println(function.apply("lugubrious"));
    }
}
