package binarysearchAlgorithm;
public class BinarySearch {

    public int[] getTargetIndexOfAnElement(int[] numbers, int target) {
     int left = 0;
     int right = numbers.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == numbers[mid]) {
               return new int[]{mid};
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1};

    }
}
