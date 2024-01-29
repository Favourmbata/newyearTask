package binarysearchAlgorithm;
public class MostFrequent {
    public int[] getFrequentNumber(int[] input) {
        int[] countArray = new int[100];

        int mostFrequent = input[0];
        int maxCount = 0;

        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            int count = ++countArray[num];

            if (count > maxCount) {
                mostFrequent = num;
                maxCount = count;
            }
        }

        return new int[]{mostFrequent};
    }

}
