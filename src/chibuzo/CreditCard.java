package chibuzo;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Hello, kindly enter your card details to verify ");
        String cardNumber = scanner.nextLine();

        if (cardNumber .length() < 13 || cardNumber .length() > 16){
            System.out.println("invalid card length");
            return;
        }

      String cardType = getCardType(cardNumber);
        if(cardType == null || cardType.equals("Invalid card type")){
            System.out.println("unknown card type");
            return;
        }
        boolean isValid = validateCard(cardNumber);
        System.out.println("******************************");
        System.out.println("*** Credit Card Type:"  + cardType);
        System.out.println("*** Credit Card Number:" + cardNumber);
        System.out.println("*** Credit Card Length:" + cardNumber.length());
        System.out.println("*** Credit Card Validity Status:" + (isValid ? "Valid":"Invalid"));
        System.out.println("**********************************");
    
        
    
    }
    public static String getCardType(String cardNumber){
        if (cardNumber .startsWith("4")){
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "discoverCard";
        }else return "invalid Card Type";
    }


    public static boolean validateCard(String cardNumber){
        int sum = 0;
        boolean checkCard =  false;
        for (int i = cardNumber.length() - 1; i >= 0 ; i--) {
              int convertCard= Integer.parseInt(cardNumber.substring(i , i + 1));
              if (checkCard){
                  convertCard *= 2;
                  if (convertCard > 9){
                      convertCard = (convertCard % 10 ) + 1;
                  }
              }
              sum += convertCard;
              checkCard = !checkCard;

        }
        return (sum  % 10 == 0);
    }

}
