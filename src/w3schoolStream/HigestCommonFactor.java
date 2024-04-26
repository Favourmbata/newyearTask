package w3schoolStream;

public class HigestCommonFactor {

    public int[] getLowestCommonFactor(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int lcm = 1;

        // Start with 2, as it is the smallest prime number
        int divisor = 2;

        while (true) {
            boolean divisible = false;
            int count = 0;

            // Check if the divisor can divide any of the numbers evenly
            for (int i = 0; i < input.length; i++) {
                if (input[i] == 0) {
                    return new int[]{0};
                }
                if (input[i] < 0) {
                    throw new IllegalArgumentException("Numbers must be positive integers.");
                }
                if (input[i] == 1) {
                    continue; // if any number is 1, it won't affect LCM
                }

                if (input[i] % divisor == 0) {
                    input[i] /= divisor;
                    divisible = true;
                }

                if (input[i] == 1) {
                    count++;
                }
            }

            if (divisible) {
                lcm *= divisor;
            } else {
                divisor++;
            }

            if (count == input.length) {
                break;
            }
        }

        return new int[]{lcm};
    }

}








