import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practice3 {
    public static void main(String[] args) {
        String word="";
        File file = new File("src/Practice3.java");
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String wordMax=getMax(line);
                    if(wordMax.length()>word.length())
                        word=wordMax;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(word);
    }

    private static String getMax(String line) {
        String[] split = line.split(" +");
        String max="";
        for(String word: split){
            if(max.length()<word.length())
                max=word;
        }
        return max;
    }

}
