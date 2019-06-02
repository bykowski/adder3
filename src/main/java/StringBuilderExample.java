public class StringBuilderExample {


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Imie: ");
        stringBuilder.append("Przemek");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Nazwisko: ");
        stringBuilder.append("Bykowski");
        System.out.println(stringBuilder.toString());
    }
}
