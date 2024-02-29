import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []numbers = new int[5];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Enter a number between 1 and 30");
            numbers[i] = scanner.nextInt();

        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}

