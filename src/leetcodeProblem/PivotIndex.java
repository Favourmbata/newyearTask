package leetcodeProblem;

public class PivotIndex {
    //    Find Pivot Index
//            Easy
//
//    Given an array of integers nums, calculate the pivot index of this array.
//
//    The pivot index is the index where the sum of all the numbers strictly to the
//    left of the index is equal to the sum of all the numbers strictly to the index's right.
//
//    If the index is on the left edge of the array,
//    then the left sum is 0 because there are no elements to the left.
//    This also applies to the right edge of the array.
//
//    Return the leftmost pivot index. If no such index exists, return -1.
//
//    Example 1:
//
//    Input: nums = [1,7,3,6,5,6]
//    Output: 3
//    Explanation:
//    The pivot index is 3.
//    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//    Right sum = nums[


    public int[] getPivotIndex(int[] input) {
        int preSum = 0;
        int totalSum = 0;
        int counter = 0;

        for (int num : input) {
            totalSum += num;
        }

        while (counter < input.length) {
            if ((2 * preSum) == (totalSum - input[counter])) return new int[]{counter};
            preSum += input[counter++];
        }
        return new int[]{-1};
    }
}
