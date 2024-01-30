package leetcodeProblem;

public class MedianOfTwoSortedArr {
    public double getMergedAndSortedArray(int[] input1, int[] input2) {
        if(input1.length < input2.length) return getMergedAndSortedArray(input2, input1);

        int i = 0, j = 0, k = 0;
        int medianIndex = (input1.length - input2.length)/2 + input2.length + 1;
        int arr[] = new int[medianIndex];

        while(i < input1.length && j < input2.length && k != medianIndex){
            if(input1[i] < input2[j]){
                arr[k] = input1[i++];
            }else{
                arr[k] = input2[j++];
            }
            k++;
        }

        while(i < input1.length && k != medianIndex){
            arr[k++] = input1[i++];
        }

        while(j < input2.length && k != medianIndex){
            arr[k++] = input2[j++];
        }

        return (input1.length + input2.length) % 2 != 0 ?
                arr[(input1.length + input2.length)/2] :
                (double)(arr[((input1.length + input2.length)-1)/2] + arr[((input1.length + input2.length)-1)/2 + 1])/2;
    }
}
