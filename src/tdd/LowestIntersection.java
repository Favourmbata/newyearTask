package tdd;

import java.util.ArrayList;
import java.util.List;

public class LowestIntersection {
    public int[] getLowestNumberIntersected(int[] input1, int[] input2) {
        int i = 0, j = 0;
        List<Integer> intersectionList = new ArrayList<>();

        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                i++;
            } else if (input1[i] > input2[j]) {
                j++;
            } else {
                intersectionList.add(input1[i]);
                i++;
                j++;
            }
        }


        int[] result = new int[intersectionList.size()];
        for (int k = 0; k < intersectionList.size(); k++) {
            result[k] = intersectionList.get(k);
        }

        return result;
    }
}


//
////        Algorithm
//
//        Create an empty ArrayList to store the result.
//        Initialize two pointers, i and j, to the start of arr1 and arr2, respectively.
//        Iterate until pointers i and j are less than their respective array lengths.
//                If arr1[i] is less than arr2[j], add arr1[i] to the result ArrayList and Increment i.
//                If arr1[i] is greater than arr2[j], add arr2[j] to the result ArrayList and increment j.
//                If arr1[i] is equal to arr2[j], add arr1[i] to the result ArrayList and Increment both i and j.
//        If there are remaining elements in arr1 or arr2, add them to the result ArrayList.
//                Convert the result ArrayList to an array of integers and return i
//



