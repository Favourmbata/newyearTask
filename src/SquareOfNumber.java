import java.util.Arrays;

public class SquareOfNumber {


    public static void main(String[] args) {

        int[] arr = {-3, 1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];

            System.out.print(arr[i] + " ");

        }
    }
}