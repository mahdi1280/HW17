import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Practice4 {
    public static void main(String[] args) throws IOException {
        String text="//alie mahdi reza ";
        String src="src/Practice4.java";
        Files.write(Paths.get(src), text.getBytes(), StandardOpenOption.APPEND);
    }
}
//alie mahdi reza
// alie mahdi reza
