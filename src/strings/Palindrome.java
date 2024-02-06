package strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reverse = "";
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (input.equals(reverse)) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not a palindrome");

        }
    }
}
