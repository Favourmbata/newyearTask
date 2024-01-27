package tdd;

public class CountFrequency {

    public int[] getFrequentNumber(int[] input) {
        int [] array = new int[input.length];
        int visited = -1;

        for(int i = 0; i < input.length; i++){
            int count = 1;
            for(int j = i+1; j < input.length; j++){
                if(input[i] == input[j]){
                    count++;
                    //To avoid counting same element again
                    array[j] = visited;
                }
            }
            if(array[i] != visited)
                array[i] = count;
        }
     return array;

    }
}
