package binarysearchAlgorithm;

public class AddDigits {
    public int getAddedDigit(int input) {
        int num = input;
        while (num > 10){
            num = (num % 10) +(num / 10);
        }
     return num;
    }
}
