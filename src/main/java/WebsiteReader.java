import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebsiteReader {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Set<String> setLinks = new HashSet<>(); // unique

        URL url = new URL("https://de.proxfree.com/permalink.php?url=%2FTbu6XiyVSVK77kuv9FKG4zgBnCMuxZ109meVRTy9OgNlmtHA1K6zNb%2F53t67drHyE7sPyid4gZiJ0BVsyBWnA%3D%3D&bit=1");
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

        for (int i = 0; i < setLinks.size(); i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        saveWebsite(finalI + ".html", setLinks.toArray()[finalI].toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();


        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void saveWebsite(String fileName, String link) throws IOException {
        URL url = new URL(link);
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }

        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.close();

    }

}
