package leetcodeProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArrTest {
    MedianOfTwoSortedArr medianOfTwoSortedArr = new MedianOfTwoSortedArr();


    @Test
    void medianOfTwoSortedArray(){
        int [] input1 = {1,3};
        int [] input2 = {2};
        double output = 2.0;
        double result = medianOfTwoSortedArr.getMergedAndSortedArray(input1, input2);
        System.out.println(result);
        assertEquals(output, result, 0.0001);
//        int [] mergedArray = {1,2,3};


    }


}
