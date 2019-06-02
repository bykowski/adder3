package lambda;

import checker.Person;
import checker.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void main(String[] args) {
        List<Person> nameList = new ArrayList<>();
        Person p1 = new Person("Karolina", Sex.FEMALE, 0);
        Person p2 = new Person("Tomasz", Sex.MALE, 1);
        Person p3 = new Person("Patrycja", Sex.FEMALE, 2);
        Person p4 = new Person("Karol", Sex.MALE, 3);
        Person p5 = new Person("Justyna", Sex.MALE, 4);
        Person p6 = new Person("Stanisław", Sex.MALE, 5);
        nameList.add(p1);
        nameList.add(p2);
        nameList.add(p3);
        nameList.add(p4);
        nameList.add(p5);
        nameList.add(p6);


        nameList
                .forEach(person ->
                        {
                            if (person.getAge() <= 1)
                                person.setSex(Sex.NONE);
                            else
                                person.setAge(person.getAge() + 10);
                            System.out.println(person);
                        }
                );
    }


}
