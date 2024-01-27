package leetcodeProblem;

public class PlusOne {
    //    Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
    public int[] getAdditionalElement(int[] digits) {
       int  hold = 0;

        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] == 9){
                hold = 1;
                digits[i] = 0;
            }else{
                hold = 0;
                digits[i]++;
                break;
            }
        }


        if(hold == 1){
            int [] newDigits = new int[digits.length + 1];
            newDigits[0] = hold;
            for(int i = digits.length; i > 0; i--){
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }

        return digits;
}
}
//        int  arrayLength = input.length;
//        for (int currentIndex = arrayLength -1; currentIndex >= 0; currentIndex--) {
//         if (input[currentIndex] < 9){
//             input[currentIndex]++;
//             return input;
////         }
//         input[currentIndex] = 0;
//         int [] newDigits = new int[arrayLength +1];
//         newDigits[0] = 1;
//        }
//        return
//    }
