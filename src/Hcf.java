public class Hcf {


    private static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int findHCFOfArray(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        int hcfResult = findHCF(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            hcfResult = findHCF(hcfResult, arr[i]);
        }

        return hcfResult;
    }

    public static void main(String[] args) {
        int[] arrayOfThreeElements = {8,16,12};
        int result = findHCFOfArray(arrayOfThreeElements);

        if (result != -1) {
            System.out.println("The Highest Common Factor (HCF) is: " + result);

        }
    }
}