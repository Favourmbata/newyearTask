package w3schoolStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
public class EvenAndOddNumber {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> oddNumbers = filter(numbers, n -> n % 2 != 0);
        System.out.println("Odd Numbers: " + oddNumbers);
    }

    private static List<Integer> filter(List<Integer> list, MyPredicate<Integer> predicate) {
        return list.stream()
                .filter(predicate::test)
                .collect(Collectors.toList());
    }

    // Functional interface for the predicate
    @FunctionalInterface
    private interface MyPredicate<T> {
        boolean test(T t);
    }
}
