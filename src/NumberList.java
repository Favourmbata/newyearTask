import java.util.Arrays;

public class NumberList {
    private static int[] processNumber(String[] numbers) {
        int[] validNumbers = new int[numbers.length];
        int validCount = 0;
        for (String number : numbers) {
            String cleanedNumber = number.replace("S//", "");
            if (!cleanedNumber.isEmpty()) {
                validNumbers[validCount++] = Integer.parseInt(cleanedNumber);

            }
        }
            if (validCount == 0) {
                return null;
            }

            int min = findSmallest(validNumbers, validCount);
            int largest = findLargest(validNumbers, validCount);

            return new int[]{min, largest};

        }




    private static int findSmallest(int[] validNumbers, int validCount) {
        int smallest = validNumbers[0];
        for (int i = 1; i < validCount; i++) {
            smallest = Math.min(smallest, validNumbers[i]);
        }
        return smallest;
    }






    private static int findLargest(int[] validNumbers, int validCount) {
        int largest = validNumbers[0];
        for (int i = 1; i < validCount; i++) {
            largest = Math.max(largest, validNumbers[i]);
        }
        return largest;
    }

    public static void main(String[] args) {


        String [] stringNumbers = {"1", "23", "44",  "55",    "66"};
         int [] stringResult = processNumber(stringNumbers);

          if (stringResult != null){
              int min  = stringResult[0];
              int max = stringResult[1];
              System.out.println("min value is " + min);
              System.out.println("man value is " + max);
            }else {
              System.out.println("No valid input entered");
          }


}





    }

