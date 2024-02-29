package chapter17.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
//        List <String> names =
//                Arrays.asList("john","susan" ,"Kim","josh");
//        List<String> result = names.stream().filter(name -> name.startsWith("j")).collect(Collectors.toList());
//        System.out.println(result);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);


    }
}