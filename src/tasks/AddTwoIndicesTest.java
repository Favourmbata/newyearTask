package tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddTwoIndicesTest {
    AddTwoIndices addTwoIndices = new AddTwoIndices();


    @Test
       void getTwoAddedIndices(){
        int [] input = {2,3,5,6,7,2};
        int [] output = {5,11,9};
        int [] result = addTwoIndices.getAddedTwoIndices(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
    }

    @Test
    void getTwoAddedIndicesTwo(){
        int [] input = {3,4,5,1,5};
        int [] output = {7,6,5};
        int [] result = addTwoIndices.getAddedTwoIndices(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
    }

}
