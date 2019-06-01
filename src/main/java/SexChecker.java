import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SexChecker {

    public static void main(String[] args) throws IOException {
        List<Person> nameList = new ArrayList<>();
        Person p1 = new Person("Karolina", Sex.FEMALE);
        Person p2 = new Person("Tomasz", Sex.MALE);
        nameList.add(p1);
        nameList.add(p2);
        nameList.add(p2);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imie:");
            String name = scanner.next();

            if (name.equals("koniec"))
                break;

            if (name.endsWith("a")) {
                System.out.println("To jest imie zenskie");
                nameList.add(new Person(name, Sex.FEMALE));
            } else {
                System.out.println("To jest imie meskie");
                nameList.add(new Person(name, Sex.MALE));
            }
        }
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("name.csv"));

        for (Person person : nameList) {
            bufferedWriter.write(person.toString());
            bufferedWriter.write(System.lineSeparator());
        }
        bufferedWriter.close();
    }


}
