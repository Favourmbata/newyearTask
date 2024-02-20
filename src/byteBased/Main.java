package byteBased;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String location = "C:\\Users\\Favour\\Desktop\\tasks\\src\\byteBased\\transaction.txt";
        List <Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("baby","delight", BigDecimal.valueOf(6000).toString()));
        transactions.add(new Transaction("favy","dera", BigDecimal.valueOf(2000).toString()));


       writeTransactionTo(transactions,location);


        }
    private  static  void writeTransactionTo(List <Transaction>transactions,String fileLocation){
        try (FileOutputStream outputStream  = new FileOutputStream(fileLocation , true)){
            String ans = transactions.toString();
            outputStream.write(ans.getBytes());
            System.out.println(ans);
        }catch (IOException exception){
         exception.printStackTrace();
        }


    }

}
