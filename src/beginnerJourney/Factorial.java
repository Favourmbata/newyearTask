package beginnerJourney;

public class Factorial {
        public static int factorial (int number){
            if (number < 0) {
                throw new IllegalArgumentException("number must be greater than 0");
            }
            if (number == 0 || number == 1) {
                return 1;
            }
            return number * factorial( number - 1);
        }

    public static void main(String[] args) {
            int result = factorial(5);
        System.out.println("The factorial  is " + result);
    }

}