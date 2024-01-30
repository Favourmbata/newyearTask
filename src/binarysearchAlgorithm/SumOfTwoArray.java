package binarysearchAlgorithm;

public class SumOfTwoArray {
    public int[] getSumOfTwoArray(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int[] sumArray = new int[length];
        for (int i = 0; i < length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        return sumArray;
    }
    }


