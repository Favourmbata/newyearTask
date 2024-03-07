package w3schoolStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("red","blue","PINK" ,"GREEN");

        System.out.println("\nOriginal strings");
        for (String str :stringList){
            System.out.println(str);
        }
        stringList.replaceAll(str -> str.toLowerCase());


        System.out.println("\nlower case");
        for (String str : stringList){
            System.out.println(str);
        }
           stringList.replaceAll(str -> str .toUpperCase());




             System.out.println("\nupper case");
             for (String str : stringList){
                 System.out.println(str);
             }
    }
}

