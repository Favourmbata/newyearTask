package tasks;

public class AddTwoIndices {

    public int[] getAddedTwoIndices(int[] input) {
        int[] newArray = new int[(input.length + 1) / 2];
        for (int i = 0; i < input.length; i += 2) {
            newArray[i / 2] = input[i];
            if (i + 1 < input.length) {
                newArray[i / 2] = input[i] + input[i + 1];
            }

        }
        return newArray;

    }


}
