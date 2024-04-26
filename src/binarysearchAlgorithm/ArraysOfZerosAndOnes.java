package binarysearchAlgorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysOfZerosAndOnes {

    public int[] getZerosAndOne(int[] input) {

        int[] output = new int[input.length];
        IntStream.range(0, input.length)
                .forEach(i -> output[i] = input[i] % 2 == 0 ? 0 : 1);

        return output;
    }
//        for (int num = 0; num < input.length; num++) {
//            replaceEvenAndOddWithZerosAndOne(input,output,num);
//        }
//
//        return output;
//
//    }
//    private  static void replaceEvenAndOddWithZerosAndOne(int [] input, int[]output , int num){
//        if (input[num] % 2 == 0 )output[num] = 0;
//        else output[num] = 1;
//    }


    //    public boolean[] getBooleanResult(int[] input) {
//      boolean[]output = new boolean[input.length];
//        for (int row = 0; row < input.length; row++) {
//            replaceNumbersWithBoolean(input,output,row);
//
//        }
//       return output;
//    }
//
//     private static void replaceNumbersWithBoolean(int[] input,boolean []output,int row){
//        if (input[row] % 2 == 0) output[row] = false;
//        else output[row] = true;
//     }
    public static boolean[] getBooleanResult(int[] input) {
        boolean[] output = new boolean[input.length];

        IntStream.range(0, input.length)
                .forEach(i -> output[i] = input[i] % 2 == 1); 

        return output;
    }

    public static int[] getDouleElementOfInput(int[] input) {
//   one way for this task
//        int n = input.length;
//        int[] result = new int[input.length * 2];
//
//
//        for (int i = 0; i < n; i++) {
//            result[i] = input[i];
//            result[i + n] = input[i] * 2;
//        }
//
//        return result;
//        second way for this task

//        int[] result = new int[input.length * 2];
//
//        IntStream.range(0, result.length)
//                .forEach(i -> result[i] = i < input.length ? input[i] : input[i - input.length] * 2);
//
//        return result;


//        Third way for this task
          int []result = new int[input.length * 2];
                System.arraycopy( input,0,result,0,input.length);
          for (int i = input.length; i < result.length ; i++) {

          result[i] = input[i - input.length]* 2;
        }
  return result;


    }
}