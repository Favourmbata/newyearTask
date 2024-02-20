package byteBased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Favour\\Desktop\\tasks\\src\\byteBased\\example.txt";
        try (FileInputStream fileInputStream =
                         new FileInputStream(fileLocation)){

          byte[] filesBytes = fileInputStream.readAllBytes();
           System.out.println(new String(filesBytes));
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}