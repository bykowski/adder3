import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextSaver {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("text.txt"));
        String name = "Przemek";
        bufferedWriter.write(name);
        bufferedWriter.close();

    }
}
