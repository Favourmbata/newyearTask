package binarysearchAlgorithm;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int index = 1; index <= 100 ; index++) {
            if (index % 3 == 0 && index % 5 == 0){
                System.out.print("fizzBuzz");
            } else if (index % 3 == 0) {
                System.out.print("fizz");
            }else if(index % 5 == 0){
                System.out.print("Buzz");
            }else {
                System.out.print(index);
            }

            System.out.println();
        }
    }
}
