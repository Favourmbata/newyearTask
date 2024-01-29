package leetcodeProblem;

public class MaximumProduct {
    public int[] getMaximumProduct(int[] input) {
        if (input.length < 2){
            return input ;
        }

     int maxProduct = Integer.MIN_VALUE;

        int maxI = -1;
        int maxJ = -1;

        for (int innerLoop = 0; innerLoop < input.length -1 ; innerLoop++) {
            for (int outterLoop = innerLoop +1; outterLoop < input.length; outterLoop++) {
                if (maxProduct < input[innerLoop] * input[outterLoop]){
                    maxProduct = input[innerLoop] * input[outterLoop];
                    maxI = innerLoop;
                    maxJ = outterLoop;
                }
            }
        }
        return new int[]{input[maxI], input[maxJ]};
    }
}
