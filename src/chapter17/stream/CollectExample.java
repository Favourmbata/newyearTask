package chapter17.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(100,2,30,4,5,1);

        List<Integer> nums = numbers.stream()
               .distinct()
              .sorted()
                .collect(Collectors.toList());

        System.out.println(nums);
    }
}
