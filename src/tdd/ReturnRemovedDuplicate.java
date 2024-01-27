package tdd;

import java.util.Arrays;

public class ReturnRemovedDuplicate {

    public int[] getRemovedElement(int[] input) {
        int current = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != input[current]) {
                input[++current] = input[i];
            }
        }

        return Arrays.copyOf(input, current+1);
    }

    public int[] returnArrayWithoutDuplicate(int[] inputArray) {
        int index = 0;
        for (int i = 0; i < inputArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (inputArray[i] == inputArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                inputArray[index++] = inputArray[i];
            }
        }

        return Arrays.copyOf(inputArray, index);
    }

    public int[] returnNonDuplicateElement(int[] input) {
        int [] nonDuplicateElements;
        int count = 0;
        int[] frequency = new int[100];
        for (int num : input) {
            frequency[num]++;
        }

        for (int freq : frequency) {
            if (freq == 1) {
                count++;
            }
        }


        nonDuplicateElements = new int[count];
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            if (frequency[input[i]] == 1) {
                nonDuplicateElements[index++] = input[i];
            }
        }

        return nonDuplicateElements;

        }
    }


