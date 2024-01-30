package binarysearchAlgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoArrayTest {
    SumOfTwoArray sumOfTwoArray = new SumOfTwoArray();


    @Test
    void sumOfTwoArray() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] output = {5, 7, 9};
        int[] result = sumOfTwoArray.getSumOfTwoArray(array1, array2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);


    }

    @Test
    void sumOfTwoArrayCaseTwo() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        int[] output = {5, 7, 9, 7};
        int[] result = sumOfTwoArray.getSumOfTwoArray(array1, array2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);
    }


}