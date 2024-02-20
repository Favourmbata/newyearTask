package byteBased;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Favour\\Downloads";
        try (DataInputStream inputStream = new DataInputStream (new FileInputStream(fileLocation))){

            byte[] bytes =  inputStream.readAllBytes();
            System.out.println(new String(bytes));
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
