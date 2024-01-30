package leetcodeProblem;

import binarysearchAlgorithm.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    void findTheSumOfTwoIndex() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] output = {0, 1};
        int[] result = twoSum.returnTwoIndices(input, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);

    }

    @Test
    void findTheSumOfTwoIndex_CaseTwo() {
        int[] input = {3, 2, 4};
        int target = 6;
        int[] output = {1,2};
        int[] result = twoSum.returnTwoIndices(input, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);

    }

    @Test
    void findTheSumOfTwoIndex_CaseThree() {
        int[] input = {3,3};
        int target = 6;
        int[] output = {0,1};
        int[] result = twoSum.returnTwoIndices(input, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);

    }

}