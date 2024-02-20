package byteBased;

import java.io.*;
import java.math.BigDecimal;

public class Example5 {
    public static void main(String[] args) {
        try (ObjectOutputStream outputStream  = new ObjectOutputStream(System.out)){
            Transaction transaction = new Transaction("Amal","buchi", BigDecimal.valueOf(700).toString());
            outputStream.writeObject(transaction);
        }catch (IOException exception){
            exception.printStackTrace();
        }


    }
}
