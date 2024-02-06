package beginnerJourney;

import java.util.Scanner;

//4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
//        a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
//        sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the num-
//        ber of items that can be sold.
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items sold: ");
        int numberOfItems = scanner.nextInt();

        double totalSales = 0;

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter the value of item " + i + ": $");
            double itemValue = scanner.nextDouble();
            totalSales += itemValue;
        }

        double commissionRate = 0.09;
        double weeklyEarning = 200;
        double earnings = weeklyEarning + (totalSales * commissionRate);


        System.out.println("Salesperson's earnings: $" + earnings);

    }
    }

