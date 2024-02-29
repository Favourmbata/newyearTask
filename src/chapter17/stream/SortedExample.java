package chapter17.stream;

import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 2,30,4,5,1);

        Comparator<Integer> comparator = (a , b)-> a.compare(a , b);


        List<Integer> nums = numbers.stream()
                .sorted(comparator)
                .toList();

        System.out.println(nums);


    }
 private  static  int compare(Integer a , Integer b){
        if (b > a )return 1;
        else if (a > b) return -1;
        return 0;
 }

}

//sorted intermidete operation