package beginnerJourney;

public class LowestIntersect {

        public static void main(String[] args) {
            int[] arr1 = {2, 3, 5, 6,7,8};
            int[] arr2 = {1, 3, 7, 10,11,8};

            int m = arr1.length;
            int n = arr2.length;

            System.out.print("Intersection of the minimum of two arrays: ");
            printIntersectionOfMin(arr1, arr2, m, n);
        }

        public static void printIntersectionOfMin(int[] arr1, int[] arr2, int m, int n) {
            int i = 0, j = 0;

            while (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    j++;
                } else {
                    // If the elements are equal, print the element and move both pointers to the next element
                    System.out.print(arr1[i] + " ");
                    i++;
                    j++;
                }
            }
        }
    }


