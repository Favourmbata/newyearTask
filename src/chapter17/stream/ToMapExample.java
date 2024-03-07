package chapter17.stream;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToMapExample {
    public static void main(String[] args) {

       Set<String> numbers = Set.of("100" ,"30" ,"90" ,"5" ,"1");
          String result = numbers.stream().collect(Collectors.joining());
        System.out.println(result);
//       Map< String,Integer> nums = numbers.stream()
//               .collect((Collectors.toMap(
//                       (element) -> element),(element)-> element.)
//


}
}