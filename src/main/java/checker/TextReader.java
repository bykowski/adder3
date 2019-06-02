package checker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader {

    public static void main(String[] args) throws IOException {

        List<Person> personList = new ArrayList<>();
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("name.csv"));

        String line ;
        while ((line = bufferedReader.readLine()) != null)
        {
            String[] sl = line.split(",");
            String name = sl[0];
            Sex sex = Sex.valueOf(sl[1]);
            personList.add(new Person(name, sex));
        }
        System.out.println(personList);

    }
}
