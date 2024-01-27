package tdd;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReturnRemovedDuplicateTest {

    @Test
    public void returningElementInAnArray_WithDuplicate() {
        ReturnRemovedDuplicate returnRemovedDuplicate = new ReturnRemovedDuplicate();
        int[] input = {1, 1, 1, 2, 2, 2, 2, 3};
        int[] output = {1, 2, 3};

        int[] result = returnRemovedDuplicate.getRemovedElement(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output, result);

    }

    @Test
    public void returningArrayWithoutDuplicate() {
        ReturnRemovedDuplicate returnRemovedDuplicate = new ReturnRemovedDuplicate();
        int[] inputArray = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int[] outputArray = {1, 2, 3, 4, 7, 8};
        int[] result = returnRemovedDuplicate.returnArrayWithoutDuplicate(inputArray);

        System.out.println(Arrays.toString(result));
        assertArrayEquals(outputArray, result);
    }
        @Test
    void returningElementWithoutDuplicate(){
        ReturnRemovedDuplicate returnRemovedDuplicate = new ReturnRemovedDuplicate();
        int []input = {2,2,1,4,4};
        int []output = {1};
        int []result = returnRemovedDuplicate.returnNonDuplicateElement(input);
            System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
  }
}

