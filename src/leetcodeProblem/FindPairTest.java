package leetcodeProblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindPairTest {
    FindPair findPair = new FindPair();

    @Test
    void findPair() {
        int[] input = {8, 7, 2, 5, 3, 1};
        int target = 10;
        int[] output = {8, 2};

        int[] result = findPair.returnPairFound(input, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);
    }


    @Test
    void findSecondPair() {
        int[] input = {8, 7, 2, 5, 3, 1};
        int target = 10;
        int[] output = {7, 3};

        int[] result = findPair.returnPairFound(input, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);
    }

}
