import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SexChecker {

    public static void main(String[] args) {
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
        System.out.println(nameList);


    }


}
