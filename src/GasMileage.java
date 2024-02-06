import java.util.Scanner;

public class GasMileage {

    public static void print(String word){
        System.out.println(word);
    }


    public double calculatingGasMilleage(double milesDriven, double gallonsUsed, double milesPergallon){

        double totalMilesDriven = milesDriven/gallonsUsed * (milesPergallon);

        print("The mile driven is ->"+milesDriven);
        print("The gallon used is ->"+gallonsUsed);
        print("The miles per gallon used is ->"+milesPergallon);
        print("The total miles driving is ->"+totalMilesDriven);
        return totalMilesDriven;
    }

    public static void main(String[] args) {
        GasMileage gasMileage = new GasMileage();
        Scanner input = new Scanner(System.in);
        print("Enter miles driven");
        double milesDriven = input.nextDouble();

        print("Enter gallon used for each thankful");
        double gallonsUsed = input.nextDouble();

        print("Enter miles per gallon");
        double milesPergallon = input.nextDouble();
        gasMileage.calculatingGasMilleage(milesDriven,gallonsUsed,milesPergallon);
    }


}


