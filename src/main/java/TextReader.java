import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("text.txt"));

        String line ;
        while ((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }
    }
}
