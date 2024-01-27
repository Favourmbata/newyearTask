package tdd;

import binarysearchAlgorithm.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {


    }

 @Test
    void binarySearchOfTarget(){
     BinarySearch binarySearch = new BinarySearch();
        int [] inputArray = {2,4,5,6,7,8,9};
        int target = 6;
        int [] outputArray = {3};

        int [] result = binarySearch .getTargetIndexOfAnElement(inputArray,target);
        assertArrayEquals(outputArray, result);
 }

}