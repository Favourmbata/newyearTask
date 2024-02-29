package chapter17.stream;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
//        List<List<Integer>>lists = List.of(List.of(10,20,30),
//                List.of(100,200,300),List.of(1000,2000,3000)
//        );
//      lists.stream()
//              .flatMap((list)->list.stream())
//              .forEach(num-> System.out.println(num));
//

      List<String>pharses = List.of(
              "1asq_" ,"qewr90" ,"bsmfgh57" ,"hfjj7reyhs"
      );

      var result =
      pharses.stream()
              .flatMap((pharse)-> pharse.chars().boxed())
              .filter(c -> c >= 48  && c <= 57)
              .count();
        System.out.println(result);

    }
}
