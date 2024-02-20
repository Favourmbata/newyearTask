package files;

import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSample {
    public static void createFile(String location, String fileName) {
     Path path = Path.of(location , fileName);
      try {
          Files.createFile(path);
//
      }catch (IOException exception){
          System.err.println(exception.getMessage());
      }

    }

    public static void createDirectory(String location) {
        Path path = Path.of(location);
        try {
            Files.createDirectory(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }

    public static void delete(String location) {
        Path path = Path.of(location);
        try {
            Files.deleteIfExists(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }


    public static void deleteDirectory(String location) {
        Path path = Path.of(location);
        try {
            Files.deleteIfExists(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
