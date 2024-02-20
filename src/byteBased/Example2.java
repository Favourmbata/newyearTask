package byteBased;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Favour\\Desktop\\tasks\\src\\byteBased\\example.txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileLocation)){
       String data = "up Nepa!";
            byte[] bytes = data.getBytes();
            fileOutputStream.write(bytes);
            System.out.println(new String(bytes));
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
