public class CircularRotationArray {
    public static int findNumberOfRotation(int [] nums) {

        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            if (nums[left] <= nums[right]) {
                return left;
            }

            int mid = (left + right) / 2;

            int next = (mid + 1) % nums.length;
            int previous = (mid - 1 + nums.length) % nums.length;

            if (nums[mid] <= nums[next] && nums[mid] <= nums[previous]) {
                return mid;
            } else if (nums[mid] <= nums[right]) {
                right = mid - 1;
            } else if (nums[mid] >= nums[left]) {
                left = mid + 1;
            }

        }
            return  -1;
    }
    public static void main(String[] args) {
    int []numberRotation = {8,9,10,2,5,6};
        System.out.println("Array is rotated "+ findNumberOfRotation(numberRotation) + "times");
    }
}
