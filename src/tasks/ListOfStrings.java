package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfStrings {
    public static void main(String[] args) {

      List<String> names = List.of("afred", "chinedu", "chioma", "delight");
       names.stream().mapToInt((num) -> num.length()).sum();
    System.out.println(names);


      var result = names.stream().mapToInt(String::length).sum();
       System.out.println(result);

    }
}