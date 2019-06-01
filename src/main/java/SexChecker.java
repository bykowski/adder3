import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SexChecker {


    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imie:");
            String name = scanner.next();

            if (name.equals("koniec"))
                break;

            nameList.add(name);
            if (name.endsWith("a")) {
                System.out.println("To jest imie zenskie");
            } else {
                System.out.println("To jest imie meskie");
            }
        }
        System.out.println(nameList);


    }


}
