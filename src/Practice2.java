import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        File file = new File("src/Practice2.java");
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    text.append(line);
                    text.append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}
