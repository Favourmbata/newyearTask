package chapter17.stream;

import java.util.List;

public class ExampleOfTerminalOperation {
    public static void main(String[] args) {
//    terminalOperation
//        you can use reduce to  add numers to strin
        Integer result = List.of("Mango","orage","Guava")
//        String result = List.of(10,20,30,40)
                .stream()
//                .map()
                .mapToInt((num)->num.length())
                .sum();
        System.out.println(result);
//                .map(String::valueOf)
//                .reduce((x,y)-> x.concat(y))
//                .orElseThrow();
//        System.out.println(result);
    }
}
