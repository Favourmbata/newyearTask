package leetcodeProblem;
//    Given an unsorted integer array, find a pair with the given sum in it.
public class FindPair {
    public int[] returnPairFound(int[] input, int target) {
        for (int innerLoop = 0; innerLoop < input.length -1 ; innerLoop++) {
            for (int outerLoop = innerLoop + 1; outerLoop < input.length; outerLoop++) {
                if (input[innerLoop] + input[outerLoop] == target){
                    return new int[]{input[innerLoop], input[outerLoop]};
            }
        }

        }
        return new int[]{-1,-1};
    }

}
