package chapter17.stream;

import java.util.Set;
import java.util.stream.Collectors;

public class ToMapExample {
    public static void main(String[] args) {

        Set<String> numbers = Set.of("100" ,"30" ,"90" ,"5" ,"1");

        Set<Integer> nums = numbers.stream()
                .distinct()
                .toList()
                .stream().collect();
        System.out.println(nums);
    }
}
