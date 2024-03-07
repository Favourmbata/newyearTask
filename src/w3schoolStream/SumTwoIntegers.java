package w3schoolStream;

public class SumTwoIntegers {
    public static void main(String[] args) {

//        Write a Java program to implement a lambda expression to find the sum of two integers.
      SumTwoNumber sumTwoNumber = Integer::sum;
      int result = sumTwoNumber.sum(7,9);

        System.out.println(result);

        result = sumTwoNumber.sum(15 , -35);
        System.out.println(result);

    }

}
