import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NameReader {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("text.txt"));

        String line ;
        while ((line = bufferedReader.readLine()) != null)
        {

        }
    }
}
