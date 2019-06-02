import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WebsiteReader {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        Set<String> setLinks = new HashSet<>(); // unique

        URL url = new URL("https://www.otodom.pl/sprzedaz/mieszkanie/sopot/");
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }

        String content = stringBuilder.toString();
        for (int i = 0; i < content.length(); i++) {
            i = content.indexOf("https://www.otodom.pl/oferta/", i);
            if (i < 0) {
                break;
            }
            String link = content.substring(i).split(".html")[0];
            setLinks.add(link);
        }

        for (String link : setLinks) {
            System.out.println(link);
        }


        //
//        System.out.println(link);
//        System.out.println(link2);


//        BufferedWriter bufferedWriter =
//                new BufferedWriter(new FileWriter("strona.html"));
//        bufferedWriter.write(stringBuilder.toString());
//        bufferedWriter.close();


        long end = System.currentTimeMillis();
        System.out.println(end - start );

    }
}
