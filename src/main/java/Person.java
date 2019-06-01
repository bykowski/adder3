public class Person {

    private String name;
    private Sex sex;

    public Person(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + "," + sex;
    }
}
