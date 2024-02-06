package beginnerJourney;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            System.out.println("Enter name of citizen ");
            String citizenName = input.nextLine();



            System.out.print("Enter " + citizenName + "'s earnings in a given year: $");
            double earnings = input.nextDouble();

            double taxRate1 = 0.15;
            double taxRate2 = 0.20;
            double taxCeiling = 30000;
            double totalTax;


            if (earnings <= taxCeiling) {
                totalTax = earnings * taxRate1;
            } else {
                totalTax = taxCeiling * taxRate1 + (earnings - taxCeiling) * taxRate2;
            }


            System.out.println(citizenName + "'s total tax: $" + totalTax);

        }


    }
    }

