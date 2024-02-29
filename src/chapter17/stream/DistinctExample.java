package chapter17.stream;

import java.util.Comparator;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 2,30,4,5,1);

        List<Integer> nums = numbers.stream()
                .distinct()
                .sorted()
                .toList();




        System.out.println(nums);
    }
}
