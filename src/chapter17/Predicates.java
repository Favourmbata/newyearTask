package chapter17;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)-> word.length() > 2;
        System.out.println(predicate.test("yes"));
    }
}
