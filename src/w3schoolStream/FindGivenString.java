package w3schoolStream;

import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to check if a given string is empty.
public class FindGivenString {
    public static void main(String[] args) {


        Predicate<String> isEmpty = str -> str.isEmpty();

        String str1 = "";
        String str2 = "my baby bad my good ,my baby all the things you do!!";


        System.out.println("string1 " + str1.isEmpty());
        System.out.println("string2 " + str2.isEmpty());
    }
}
