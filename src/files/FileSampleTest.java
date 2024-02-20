package files;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FileSampleTest {
    @Test
    public void testCreateFile(){
        String fileName = "sample.txt";
        String location = "C:\\Users\\Favour\\Desktop\\tasks\\src\\Files";
        FileSample.createFile(location,fileName);

        Path path = Paths.get(location , fileName);
        System.out.println(path);
        assertTrue(Files.exists(path));
    }

@Test
    public void createDirectory(){
        String location = "C:\\Users\\Favour\\Desktop\\tasks\\favour";
        FileSample .createDirectory(location);

        Path path = Path.of(location);
    System.out.println(path);
        assertTrue(Files.exists(path));
}

@Test
    public void testToDeleteFiles(){
    String location = "C:\\Users\\Favour\\Desktop\\tasks\\Ogechi.java";
    FileSample .delete(location);

    Path path = Path.of(location);
    System.out.println(path);
    assertFalse(Files.exists(path));
}


@Test
    public void deleteDirectory(){
    String location = "C:\\Users\\Favour\\Desktop\\tasks\\Delight";
    FileSample .deleteDirectory(location);

    Path path = Path.of(location);
    System.out.println(path);
    assertFalse(Files.exists(path));

}
}
