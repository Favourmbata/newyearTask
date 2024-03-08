package w3schoolStream;

import java.util.Arrays;
import java.util.List;

public class AverageOfListDouble {
    public static void main(String[] args) {
//        Write a Java program to implement a
//        lambda expression to find
//        the average of a list of doubles.

        List<Double>doubleList = Arrays.asList(23.5,10.2,30.6,90.6,15.2);

        System.out.println(doubleList);
        /*for (double number:doubleList){
            System.out.println(number);
        }*/
        double average = doubleList.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage of the original value" + average);

    }
}
