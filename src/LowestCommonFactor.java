public class LowestCommonFactor {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate LCM using GCD
    static int lcmOfArray(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1; // Return a meaningful value or throw an exception based on your requirements.
        }

        int lcmResult = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            lcmResult = Math.abs(lcmResult * numbers[i]) / gcd(lcmResult, numbers[i]);
        }

        return lcmResult;
    }

    public static void main(String[] args) {
        int[] array = {16, 24, 40};

        int result = lcmOfArray(array);

        if (result != -1) {
            System.out.print("LCM of elements in the array is: " + result);
        }
    }
    }

