package binarysearchAlgorithm;
public class BinarySearch {
    public static int getIndexOfTarget(int [] number,int target) {

        int left = 0;
        int right = number.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (target == number[mid]){
                return mid;
            }
            else if (target < number[mid]) {
                right  = mid -1;
            }else {
                left = mid +1;
            }
        }
      return -1;
    }
    public static void main(String[] args) {
      int [] search = {1,2,4,5,6,8,9};
      int target = 6;
      int index = getIndexOfTarget(search,target);
      if(index != -1){
          System.out.println("Element found at index:" + index);
      }else {
          System.out.println("Element not found");
      }

    }
}
