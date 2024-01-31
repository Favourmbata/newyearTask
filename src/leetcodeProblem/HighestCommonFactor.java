package leetcodeProblem;

import java.util.ArrayList;

import static leetcodeProblem.ListNode.convertToArray;

public class HighestCommonFactor {
    public int[] getHighestCommonFactor(int[] input) {

//        ArrayList<Integer> highestCommonDivisor = new ArrayList<Integer>();
//        int index = 0;
//        int maximum = maximumOf(input);
//        for (int counter = 2; counter < maximum; ) {
//
//            for (int count = 0; count < input.length; count++) {
//                if (input[count] % counter == 0) {
//                    index++;
//                }
//            }
//            if (index == input.length) {
//                highestCommonDivisor.add(counter);
//                index = 0;
//                numberDivisibleByAll(input, counter);
//            } else {
//                counter++;
//                index = 0;
//            }
//
//        }
//        return convertToArray1(highestCommonDivisor);
//    }
//
//    private static void numberDivisibleByAll(int[] array, int counter) {
//        for (int count = 0; count < array.length; count++) {
//            array[count] /= counter;
//        }
//    }
//
//    private static int maximumOf(int[] array) {
//        int largest = array[0];
//        for (int count = 0; count < array.length; count++) {
//            if (count > largest) largest = count;
//
//        }
//        return largest;
    }

}
//        int count = 1;
//        int num1 = 0;
//        int num2 = 0;
//
//        for (int index = 1; index < input.length; index++) {
//            input[num1] = input[num2];
//          if (input[num1] % index == 0 && input[num2] % index == 0){
//
//          }
//        }
//      return new int[]{count};
//    }
//}
//        if (input == null || input.length == 0) {
//            throw new IllegalArgumentException("Input array is empty or null");
//        }
//
//        int hcf = input[0];
//
//        for (int i = 1; i < input.length; i++) {
//            hcf = findHCF(hcf, input[i]);
//            if (hcf == 1) {
//                break;
//            }
//        }
//
//        return new int[]{hcf};
//    }
//
//        private int findHCF(int a, int b) {
//            while (b != 0) {
//                int temp = b;
//                b = a % b;
//                a = temp;
//            }
//            return a;
//        }


//     Initially set HCF to 1.
//            Step 2: Run a loop between [1, min(num1, num2)] throughout the iteration of (i).
//            Step 3: List the largest number that divides both numbers 1 and 2 in your notes.
//            Step 4: If i meets the conditions (num1% i == 0 && num2% i == 0), then i is the new HCF value.