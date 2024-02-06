package beginnerJourney;

import java.util.Scanner;

public class GasMileageTwo {
    public static void main(String[] args) {


        double milesPerGallon = 0;

        int totalMiles = 0;

        int totalGallons = 0;

        double totalMPG = 0;


        Scanner input = new Scanner(System.in);


        while (true) {

            System.out.print("Enter the miles driven: ");

            int miles = input.nextInt();

            if (miles <= 0)

                break;

            else {

                System.out.print("Enter the gallons used: ");

                int gallons = input.nextInt();

                totalMiles += miles;

                totalGallons += gallons;

                milesPerGallon = (double) miles / gallons;

                totalMPG = (double) totalMiles / totalGallons;

                System.out.println("Miles per gallon for this trip is:"+ milesPerGallon);

                System.out.println("Total miles per gallon is: "+ totalMPG);

            }

        }


    }
}
