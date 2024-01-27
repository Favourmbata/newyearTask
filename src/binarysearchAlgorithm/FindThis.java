package binarysearchAlgorithm;

public class FindThis {
    static int[] findNonDuplicateElements(int arr[]) {
        int[] nonDuplicateElements;
        int count = 0;

        // Count the frequency of each element in the array
        int[] frequency = new int[100]; // Assuming the range of elements is from 0 to 1000
        for (int num : arr) {
            frequency[num]++;
        }

        // Count the number of elements with frequency 1
        for (int freq : frequency) {
            if (freq == 1) {
                count++;
            }
        }

        // Create an array to store the non-duplicate elements
        nonDuplicateElements = new int[count];
        int index = 0;

        // Add elements with frequency 1 to the nonDuplicateElements array
        for (int i = 0; i < arr.length; i++) {
            if (frequency[arr[i]] == 1) {
                nonDuplicateElements[index++] = arr[i];
            }
        }

        return nonDuplicateElements;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 3, 3};

        System.out.println("Elements with no duplicates: ");

        int[] nonDuplicateElements = findNonDuplicateElements(arr);

        if (nonDuplicateElements.length == 0) {
            System.out.println("No elements with no duplicates found.");
        } else {
            System.out.print("Non-duplicate elements: ");
            for (int element : nonDuplicateElements) {
                System.out.print(element + " ");
            }
        }
    }
//    static void printRepeating(int arr[], int n) {
//        // First check all the values that are
//        // present in an array then go to that
//        // values as indexes and increment by
//        // the size of array
//        for (int i = 0; i < n; i++) {
//            int index = arr[i] % n;
//            arr[index] += n;
//        }
//
//        // Now check which value exists more
//        // than once by dividing with the size
//        // of array
//        for (int i = 0; i < n; i++) {
//            if ((arr[i] / n) >= 2)
//                System.out.println(i + " ");
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        int arr[] = { 2,2,1,3,3};
//        int arr_size = arr.length;
//
//        System.out.println("The repeating elements are: ");
//
//        printRepeating(arr, arr_size);
//
//    }
}
