package leetcodeProblem;

public class Palindrome {
    public static boolean isPalindrome(int value){
        if (value < 0)return false;
        int input = value;
        int output = 0;
        while (value > 0){
            output = output * 10 + (value % 10);
            input /= 10;
        }
      return true;
    }
}
