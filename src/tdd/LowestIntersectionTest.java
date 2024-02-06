package tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LowestIntersectionTest {
    LowestIntersection lowestIntersection = new LowestIntersection();
    @Test
    void intersectAndPrintLowest(){
        int [] input1 = {2,3,5,6,7,8};
        int [] input2  = {1,3,7,10,11,8};
        int [] output = {3};
        int [] result = lowestIntersection.getLowestNumberIntersected(input1,input2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);

    }

    @Test
    void intersectAndPrintLowest_CaseTwo(){
        int [] input1 = {5,4,11,13,9};
        int [] input2  = {9,11,15,14};
        int [] output = {9};
        int [] result = lowestIntersection.getLowestNumberIntersected(input1,input2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);

    }
}
