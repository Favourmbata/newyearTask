package chapter17;

import java.util.function.BiPredicate;

public class BiPredicates {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (number, name) -> {
            if (number > Integer.parseInt(name))
                return true;
            return false;

        };

        System.out.println(biPredicate.test(2, "2"));
    }
}
