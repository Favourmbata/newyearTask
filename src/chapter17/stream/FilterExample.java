package chapter17.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
       List <String> names =
               Arrays.asList("john","susan" ,"Kim","josh");
       List<String> result = names.stream().filter(name -> name.startsWith("j")).collect(Collectors.toList());
      System.out.println(result);

//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);

//        creating the stream directly
//        List<Integer> numbers = List.of(1,2,3,4,5);
//        Stream.of(1,2,3,4,5)
//                .map((num)-> num * 2)
//                .forEach(System.out::println);

//        Stream .generate(()-> new Random().nextInt())
//                .limit(5)
//                .forEach((num)-> System.out.println(num));

    }
}