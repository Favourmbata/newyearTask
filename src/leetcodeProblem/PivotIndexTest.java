package leetcodeProblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PivotIndexTest {
    PivotIndex pivotIndex =  new PivotIndex();

    @Test
    void findThePivotIndex(){
        int [] input = {1,7,3,6,5,6};
        int [] output = {3};
        int [] result = pivotIndex.getPivotIndex(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);

    }

}
