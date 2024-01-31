package leetcodeProblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HighestCommonFactorTest {
    HighestCommonFactor highestCommonFactor = new HighestCommonFactor();

    @Test
    void findHighestCommonFactor(){
        int [] input = {8,4,12};
        int [] output = {2,2};
        int [] result = highestCommonFactor.getHighestCommonFactor(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
    }


    @Test
    void findHighestCommonFactorTwo(){
        int [] input = {6,3,9};
        int [] output = {3};
        int [] result = highestCommonFactor.getHighestCommonFactor(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
    }
}
