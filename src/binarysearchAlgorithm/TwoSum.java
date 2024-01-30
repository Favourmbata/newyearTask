package binarysearchAlgorithm;

public class TwoSum {
    public int[] returnTwoIndices(int[] input, int target) {
        for (int i = 0; i < input.length-1 ; i++) {
            for (int j = i +1; j < input.length ; j++) {

              int sum = input[i] + input[j];
               if (sum == target){
                   return new int[]{i , j};
            } else if (sum < target) {
                   i++;
               }else {
                   j--;
               }


            }
        }
    return new int[2];
    }
}
