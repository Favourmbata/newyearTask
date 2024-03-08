package w3schoolStream;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class SortListOfStrings {
    public static void main(String[] args) {
// Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.


        List<String> stringList = Arrays.asList("koca","abigail","chimzy" ,"tobechukwu","kele");

        System.out.println(stringList);
        for (String ch :stringList){
            System.out.println(ch);
        }
        stringList.sort((str1,str2)-> str1.compareToIgnoreCase(str2));


        System.out.println("\nsorted strings:");
        for (String str:stringList){
            System.out.println(str);
        }
    }
}
